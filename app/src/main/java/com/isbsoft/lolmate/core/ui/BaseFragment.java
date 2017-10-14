package com.isbsoft.lolmate.core.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.isbsoft.lolmate.SendRequest;
import com.isbsoft.lolmate.core.network.interfaces.OnResponse;
import com.isbsoft.lolmate.core.network.response.BaseResponse;

/**
 * Created by emre on 10/6/2017.
 */

public class BaseFragment extends Fragment {

    protected SendRequest sendRequestInstance = null;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        sendRequestInstance = new SendRequest();
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public void sendRequest(String url, OnResponse onResponse, Class<? extends BaseResponse> responseClass) {
        if (isAdded() && getActivity() instanceof BaseActivity) {
            ((BaseActivity) getActivity()).sendRequest(url, onResponse, responseClass);
        }
    }
}
