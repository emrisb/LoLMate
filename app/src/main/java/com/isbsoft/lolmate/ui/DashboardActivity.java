package com.isbsoft.lolmate.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.android.volley.VolleyError;
import com.isbsoft.lolmate.R;
import com.isbsoft.lolmate.adapter.ViewPagerAdapter;
import com.isbsoft.lolmate.core.network.interfaces.OnResponse;
import com.isbsoft.lolmate.core.network.response.BaseResponse;
import com.isbsoft.lolmate.core.network.response.MatchListResponse;
import com.isbsoft.lolmate.core.ui.BaseActivity;
import com.isbsoft.lolmate.enums.LoginEnum;
import com.isbsoft.lolmate.viewmodel.DashboardVM;

public class DashboardActivity extends BaseActivity implements NavigationView.OnNavigationItemSelectedListener, OnResponse {

    DashboardVM dashboardVM;
    //widget
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Bundle bundle = getIntent().getExtras();
        dashboardVM = bundle.getParcelable(LoginEnum.User.toString());

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

    private void initView() {
        tabLayout = (TabLayout) findViewById(R.id.activity_dashboard_tabLayout);
        viewPager = (ViewPager) findViewById(R.id.activity_dashboard_viewPager);
        tabLayout.setupWithViewPager(viewPager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        ProfileFragment profileFragment = new ProfileFragment();
        ChampionsFragment championsFragment = new ChampionsFragment();
        viewPagerAdapter.addFragment(ProfileFragment.newInstance(dashboardVM), "Profile");
        viewPagerAdapter.addFragment(championsFragment, "Champions");

        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setCurrentItem(0);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.navigation_view);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout,
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
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);


        initEvent();
        printData();

    }

    private void printData() {
        if (dashboardVM != null) {
            setTitle(dashboardVM.getName());
            Toast.makeText(this, dashboardVM.getName(), Toast.LENGTH_SHORT).show();
        }
    }

    private void initEvent() {

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
            case R.id.menu_principal:
                Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
                break;

            case R.id.rechercher:
                Toast.makeText(this, "2", Toast.LENGTH_SHORT).show();
                break;

        }

        return true;
    }

    @Override
    public void onSuccessResponse(BaseResponse baseResponse) {

        if (baseResponse instanceof MatchListResponse) {
            MatchListResponse matchListResponse = (MatchListResponse) baseResponse;
            if (matchListResponse != null) {
                Log.d("fadfa", matchListResponse.toString());
                Toast.makeText(this, matchListResponse.getData().toString(), Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public void onErrorResponse(VolleyError error, Class<? extends BaseResponse> responseClass) {

    }
}
