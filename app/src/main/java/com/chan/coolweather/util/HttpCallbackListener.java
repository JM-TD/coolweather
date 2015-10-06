package com.chan.coolweather.util;

/**
 * Created by Chan on 2015/10/6.
 */
public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
