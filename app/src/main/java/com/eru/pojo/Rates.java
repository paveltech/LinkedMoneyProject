package com.eru.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by lolipop on 3/10/2018.
 */

public class Rates {

    @SerializedName("EUR")
    @Expose
    private List<EUR> eUR = null;

    public List<EUR> getEUR() {
        return eUR;
    }

    public void setEUR(List<EUR> eUR) {
        this.eUR = eUR;
    }
}
