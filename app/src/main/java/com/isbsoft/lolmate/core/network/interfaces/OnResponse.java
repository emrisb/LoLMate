package com.isbsoft.lolmate.core.network.interfaces;

import com.android.volley.VolleyError;
import com.isbsoft.lolmate.core.network.response.BaseResponse;

/**
 * Created by emre on 10/5/2017.
 */

public interface OnResponse {

    void onSuccessResponse(BaseResponse baseResponse);

    void onErrorResponse(VolleyError error, Class<? extends BaseResponse> responseClass);

}
