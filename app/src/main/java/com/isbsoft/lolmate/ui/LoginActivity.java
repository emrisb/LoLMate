package com.isbsoft.lolmate.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
    }


    private void initView() {
        edtSummoner = (EditText) findViewById(R.id.activity_login_edtSummonerId);
        btnLogin = (Button) findViewById(R.id.activity_login_btnLogin);

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
                String url = RequestURL.BaseURL.toString()
                        + "summoner/v3/summoners/by-name/"
                        + summonerName
                        + "?api_key="
                        + "RGAPI-79a232f6-b69e-46c5-948e-765610fd0739";
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
                Log.d(TAG, summonerResponse.toString());
                Toast.makeText(this, summonerResponse.getSummoner().toString(), Toast.LENGTH_SHORT).show();
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
                startActivity(intent);
                finish();

            }
        }
    }

    @Override
    public void onErrorResponse(VolleyError error, Class<? extends BaseResponse> responseClass) {

    }

}
