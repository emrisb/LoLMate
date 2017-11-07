package com.isbsoft.lolmate.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.android.volley.VolleyError;
import com.isbsoft.lolmate.R;
import com.isbsoft.lolmate.adapter.ViewPagerAdapter;
import com.isbsoft.lolmate.core.network.endpoints.match.dto.Match;
import com.isbsoft.lolmate.core.network.enums.RequestURL;
import com.isbsoft.lolmate.core.network.interfaces.OnResponse;
import com.isbsoft.lolmate.core.network.response.BaseResponse;
import com.isbsoft.lolmate.core.network.response.MatchListResponse;
import com.isbsoft.lolmate.core.network.response.MatchResponse;
import com.isbsoft.lolmate.core.ui.BaseActivity;
import com.isbsoft.lolmate.enums.LoginEnum;
import com.isbsoft.lolmate.viewmodel.DashboardVM;
import com.isbsoft.lolmate.viewmodel.MatchListVM;

import java.util.ArrayList;

public class DashboardActivity extends BaseActivity implements NavigationView.OnNavigationItemSelectedListener, OnResponse {

    int i = 0;
    private DashboardVM dashboardVM;
    private MatchListVM matchListVM;
    private ArrayList<Match> matches;
    private Long[] gameIds;
    //widget
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private ActionBarDrawerToggle toggle;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        initView();

        /*long accountId = dashboardVM.getAccountID();

        String url = RequestURL.BaseURL.toString()
                + "match/v3/matchlists/by-account/"
                + accountId
                + "/recent"
                + "?api_key="
                + "RGAPI-9e1b9a43-3611-4c56-8a8b-6175a4a797d6";
            sendRequest(url, DashboardActivity.this, MatchListResponse.class);*/


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        toggle.syncState();
    }

    private void initView() {
        matches = new ArrayList<>();
        gameIds = new Long[20];
        matchListVM = new MatchListVM();
        tabLayout = (TabLayout) findViewById(R.id.activity_dashboard_tabLayout);
        viewPager = (ViewPager) findViewById(R.id.activity_dashboard_viewPager);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.navigation_view);

        toggle = new ActionBarDrawerToggle(this, drawerLayout,
                toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        ) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };
        drawerLayout.addDrawerListener(toggle);
        navigationView.setNavigationItemSelectedListener(this);

        initEvent();

    }

    private void initEvent() {
        setSupportActionBar(toolbar);
        Bundle bundle = getIntent().getExtras();
        dashboardVM = bundle.getParcelable(LoginEnum.User.toString());
        if (dashboardVM != null) {
            setTitle(dashboardVM.getName());
            Toast.makeText(this, dashboardVM.getName(), Toast.LENGTH_SHORT).show();
        }

        getRecentMatches();


    }

    private void setViewPager() {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(ProfileFragment.newInstance(dashboardVM, matchListVM), "Profile");
        viewPagerAdapter.addFragment(new ChampionsFragment(), "Champions");
        viewPager.setAdapter(viewPagerAdapter);

        tabLayout.setupWithViewPager(viewPager);
        viewPager.setCurrentItem(0);

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.isChecked()) {
            item.setChecked(false);
        } else {
            item.setChecked(true);
        }

        drawerLayout.closeDrawers();

        switch (item.getItemId()) {
            case R.id.menu_login:
                startActivity(new Intent(this, LoginActivity.class));
                //Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
                break;

            case R.id.menu_recent_matches:
                viewPager.setCurrentItem(0);
                //Toast.makeText(this, "2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.champions:
                viewPager.setCurrentItem(1);
                //Toast.makeText(this, "2", Toast.LENGTH_SHORT).show();
                break;

        }

        return true;
    }

    private void getRecentMatches() {

        long accountId = dashboardVM.getAccountID();
        String url = RequestURL.MatchListURL.toString()
                + accountId
                + "/recent"
                + "?api_key="
                + RequestURL.ApiKey;
        sendRequest(url, DashboardActivity.this, MatchListResponse.class);
    }

    @Override
    public void onSuccessResponse(BaseResponse baseResponse) {
        if (baseResponse instanceof MatchListResponse) {
            MatchListResponse matchListResponse = (MatchListResponse) baseResponse;
            if (matchListResponse != null) {
                for (int i = 0; i < matchListResponse.getData().getMatches().size(); i++) {
                    gameIds[i] = matchListResponse.getData().getMatches().get(i).getGameId();
                }
                //Logger.d(gameIds);
                //getMatchDetail();
                if (i == 0) {
                    String url;
                    url = RequestURL.MatchDetailURL.toString()
                            + gameIds[i]
                            + "?api_key="
                            + RequestURL.ApiKey;
                    sendRequest(url, DashboardActivity.this, MatchResponse.class);
                    i++;
                }
            }
        } else if (baseResponse instanceof MatchResponse) {
            MatchResponse matchResponse = (MatchResponse) baseResponse;
            if (matchResponse != null) {
                matches.add(matchResponse.getData());
                if (i > 0 && i < 20) {
                    String url;
                    url = RequestURL.MatchDetailURL.toString()
                            + gameIds[i]
                            + "?api_key="
                            + RequestURL.ApiKey;
                    sendRequest(url, DashboardActivity.this, MatchResponse.class);
                    i++;
                } else if (i == 20) {
                    matchListVM.setMatches(matches);
                    setViewPager();
                }
            }
        }
    }

    @Override
    public void onErrorResponse(VolleyError error, Class<? extends BaseResponse> responseClass) {

    }

    private void getMatchDetail() {
        String url;
        for (int i = 0; i < 20; i++) {
            url = RequestURL.MatchDetailURL.toString()
                    + gameIds[i]
                    + "?api_key="
                    + RequestURL.ApiKey;
            sendRequest(url, DashboardActivity.this, MatchResponse.class);
        }
    }
}
