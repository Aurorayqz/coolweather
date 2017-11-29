package com.aurorayqz.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Aurorayqz on 2017/11/29.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
