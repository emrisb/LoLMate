package com.isbsoft.lolmate.ui;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.VolleyError;
import com.isbsoft.lolmate.R;
import com.isbsoft.lolmate.adapter.RecyclerRecentMatchesAdapter;
import com.isbsoft.lolmate.core.network.endpoints.match.dto.Match;
import com.isbsoft.lolmate.core.network.enums.RequestURL;
import com.isbsoft.lolmate.core.network.interfaces.OnResponse;
import com.isbsoft.lolmate.core.network.response.BaseResponse;
import com.isbsoft.lolmate.core.network.response.MatchListResponse;
import com.isbsoft.lolmate.core.ui.BaseFragment;
import com.isbsoft.lolmate.enums.LoginEnum;
import com.isbsoft.lolmate.viewmodel.DashboardVM;
import com.isbsoft.lolmate.viewmodel.MatchListVM;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

import java.util.ArrayList;

public class ProfileFragment extends BaseFragment implements OnResponse {
    private static final String TAG = ProfileFragment.class.getSimpleName();
    View view;
    private SwipeRefreshLayout swipeRefreshLayout;
    private RecyclerView rvRecentMatches;
    private RecyclerRecentMatchesAdapter adapter;
    private ArrayList<Match> matchList;
    private DashboardVM dashboardVM;
    private MatchListVM matchListVM;

    public ProfileFragment() {

    }

    public static ProfileFragment newInstance(DashboardVM dashboardVM, MatchListVM matchListVM) {
        ProfileFragment fragment = new ProfileFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(LoginEnum.User.toString(), dashboardVM);
        bundle.putParcelable("asd", matchListVM);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            dashboardVM = new DashboardVM();
            matchListVM = new MatchListVM();
            dashboardVM = getArguments().getParcelable(LoginEnum.User.toString());
            matchListVM = getArguments().getParcelable("asd");
        }
        Logger.addLogAdapter(new AndroidLogAdapter());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_profile, container, false);
        initView();
        return view;
    }

    private void initView() {
        swipeRefreshLayout = view.findViewById(R.id.fragment_profile_srl_master);
        rvRecentMatches = view.findViewById(R.id.fragment_profile_rv_recent_matches);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        //rvRecentMatches.setHasFixedSize(true);
        rvRecentMatches.setLayoutManager(layoutManager);
        rvRecentMatches.setItemAnimator(new DefaultItemAnimator());
        matchList = matchListVM.getMatches();
        adapter = new RecyclerRecentMatchesAdapter(matchList, (DashboardActivity) getActivity(), dashboardVM.getAccountID());
        rvRecentMatches.setAdapter(adapter);


    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.d(TAG, "onActivityCreated");
        super.onActivityCreated(savedInstanceState);

    }

    private void initEvent() {
        String url = RequestURL.BaseURL.toString()
                + "match/v3/matchlists/by-account/"
                + dashboardVM.getAccountID()
                + "/recent"
                + "?api_key="
                + RequestURL.ApiKey;
        Log.d(TAG, "accountId: " + dashboardVM.getAccountID());
        //sendRequestInstance.sendMatchListRequest((BaseActivity) getActivity(), dashboardVM.getAccountID(), ProfileFragment.this);
        sendRequest(url, this, MatchListResponse.class);
    }


    @Override
    public void onSuccessResponse(BaseResponse baseResponse) {
        if (baseResponse instanceof MatchListResponse) {
            MatchListResponse matchListResponse = (MatchListResponse) baseResponse;
            if (matchListResponse != null) {
                Long gameId = matchListResponse.getData().getMatches().get(0).getGameId();
                Logger.d(gameId);

            }
        }
    }

    @Override
    public void onErrorResponse(VolleyError error, Class<? extends BaseResponse> responseClass) {

    }
}
