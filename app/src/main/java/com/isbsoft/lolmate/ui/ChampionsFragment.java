package com.isbsoft.lolmate.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.Toast;

import com.isbsoft.lolmate.R;
import com.isbsoft.lolmate.adapter.ChampionsGridAdapter;
import com.isbsoft.lolmate.core.network.endpoints.champion.dto.Champion;
import com.isbsoft.lolmate.core.network.interfaces.AllChampionsCallBack;
import com.isbsoft.lolmate.core.ui.BaseFragment;
import com.isbsoft.lolmate.util.RiotApiUtil;

import java.util.Collections;
import java.util.List;


public class ChampionsFragment extends BaseFragment {

    private ChampionsGridAdapter adapter;
    //private ProgressBar pbChampions;
    private GridView gridView;
    private View view;

    public static ChampionsFragment newInstance(String param1, String param2) {
        ChampionsFragment fragment = new ChampionsFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_champions, container, false);
        initView();
        return view;
    }

    private void initView() {
        //pbChampions = view.findViewById(R.id.champions_fragment_pb);
        gridView = view.findViewById(R.id.champions_grid_view);
        initEvent();
    }

    private void initEvent() {
        RiotApiUtil riotApiUtil = new RiotApiUtil();
        //pbChampions.setVisibility(View.VISIBLE);
        riotApiUtil.getAllChampions(getActivity(), new AllChampionsCallBack() {
            @Override
            public void onSuccess(List<Champion> championList) {
                //pbChampions.setVisibility(View.GONE);
                adapter = new ChampionsGridAdapter(getContext(), championList);
                Collections.sort(championList);
                gridView.setAdapter(adapter);
            }

            @Override
            public void onFailure(String message) {
                //pbChampions.setVisibility(View.GONE);
                Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
            }
        });

    }

}
