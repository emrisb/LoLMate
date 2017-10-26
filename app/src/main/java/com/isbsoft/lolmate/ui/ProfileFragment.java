package com.isbsoft.lolmate.ui;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.volley.VolleyError;
import com.isbsoft.lolmate.R;
import com.isbsoft.lolmate.core.network.interfaces.OnResponse;
import com.isbsoft.lolmate.core.network.response.BaseResponse;
import com.isbsoft.lolmate.core.ui.BaseFragment;
import com.isbsoft.lolmate.enums.LoginEnum;
import com.isbsoft.lolmate.viewmodel.DashboardVM;

public class ProfileFragment extends BaseFragment implements OnResponse {
    private static final String TAG = ProfileFragment.class.getSimpleName();
    TextView trytxt;
    DashboardVM dashboardVM;

    public ProfileFragment() {

    }

    public static ProfileFragment newInstance(DashboardVM dashboardVM) {
        ProfileFragment fragment = new ProfileFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(LoginEnum.User.toString(), dashboardVM);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            dashboardVM = new DashboardVM();
            dashboardVM = getArguments().getParcelable(LoginEnum.User.toString());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        trytxt = view.findViewById(R.id.texttry);

        trytxt.setText(dashboardVM.toString());
        initEvent();

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.d(TAG, "onActivityCreated");
        super.onActivityCreated(savedInstanceState);

    }

    private void initEvent() {
        Log.d(TAG, "accountId: " + dashboardVM.getAccountID());
        //sendRequestInstance.sendMatchListRequest((BaseActivity) getActivity(), dashboardVM.getAccountID(), ProfileFragment.this);
        //sendRequest();
    }


    @Override
    public void onSuccessResponse(BaseResponse baseResponse) {

    }

    @Override
    public void onErrorResponse(VolleyError error, Class<? extends BaseResponse> responseClass) {

    }
}
