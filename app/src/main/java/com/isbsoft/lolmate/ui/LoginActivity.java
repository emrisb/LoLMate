package com.isbsoft.lolmate.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.android.volley.VolleyError;
import com.isbsoft.lolmate.R;
import com.isbsoft.lolmate.core.network.enums.RequestURL;
import com.isbsoft.lolmate.core.network.interfaces.OnResponse;
import com.isbsoft.lolmate.core.network.response.BaseResponse;
import com.isbsoft.lolmate.core.network.response.SummonerResponse;
import com.isbsoft.lolmate.core.ui.BaseActivity;
import com.isbsoft.lolmate.enums.LoginEnum;
import com.isbsoft.lolmate.viewmodel.DashboardVM;

public class LoginActivity extends BaseActivity implements View.OnClickListener, OnResponse {

    private final static String TAG = LoginActivity.class.getSimpleName();
    private EditText edtSummoner;
    private Button btnLogin;
    private ProgressBar pbLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        /*VideoView videoView = (VideoView) findViewById(R.id.bgvideo);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.vid);
        videoView.setVideoURI(uri);
        videoView.start();

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });*/

        initView();
    }


    private void initView() {
        edtSummoner = (EditText) findViewById(R.id.activity_login_edtSummonerId);
        btnLogin = (Button) findViewById(R.id.activity_login_btnLogin);
        pbLogin = (ProgressBar) findViewById(R.id.activity_login_pbLogin);

        initEvent();
    }

    private void initEvent() {
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.activity_login_btnLogin) {
            String summonerName = edtSummoner.getText().toString().trim();
            if (summonerName.length() > 0) {
                pbLogin.setVisibility(View.VISIBLE);
                getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
                        WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
                String url = RequestURL.LoginURL.toString()
                        + summonerName
                        + "?api_key="
                        + RequestURL.ApiKey;
                sendRequest(url, LoginActivity.this, SummonerResponse.class);
            } else {
                Toast.makeText(this, "Please enter a summoner name!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public void onSuccessResponse(BaseResponse baseResponse) {
        if (baseResponse instanceof SummonerResponse) {
            SummonerResponse summonerResponse = (SummonerResponse) baseResponse;
            if (summonerResponse != null) {
                Log.d(TAG, summonerResponse.getSummoner().toString());
                //Toast.makeText(this, summonerResponse.getSummoner().toString(), Toast.LENGTH_SHORT).show();
                DashboardVM dashboardVM = new DashboardVM();
                Bundle bundle = new Bundle();

                dashboardVM.setAccountID(summonerResponse.getSummoner().getAccountID());
                dashboardVM.setId(summonerResponse.getSummoner().getId());
                dashboardVM.setName(summonerResponse.getSummoner().getName());
                dashboardVM.setProfileIconID(summonerResponse.getSummoner().getProfileIconID());
                dashboardVM.setRevisionDate(summonerResponse.getSummoner().getRevisionDate());
                dashboardVM.setSummonerLevel(summonerResponse.getSummoner().getSummonerLevel());

                bundle.putParcelable(LoginEnum.User.toString(), dashboardVM);
                Intent intent = new Intent(this, DashboardActivity.class);
                intent.putExtras(bundle);

                pbLogin.setVisibility(View.GONE);
                getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
                startActivity(intent);
                finish();

            }
        }
    }

    @Override
    public void onErrorResponse(VolleyError error, Class<? extends BaseResponse> responseClass) {
        pbLogin.setVisibility(View.GONE);
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
        Toast.makeText(this, "Please enter a valid summoner name!", Toast.LENGTH_SHORT).show();
        Log.d("sumname: ", edtSummoner.getText().toString());
    }

}
