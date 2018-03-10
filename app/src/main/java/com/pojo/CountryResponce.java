package com.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by lolipop on 3/9/2018.
 */

public class CountryResponce {

    @SerializedName("iso_code")
    @Expose
    private String isoCode;
    @SerializedName("name")
    @Expose
    private String name;

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Country{" +
                "iso_code='" + isoCode + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
