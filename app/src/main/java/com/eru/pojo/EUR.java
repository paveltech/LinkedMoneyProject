package com.eru.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by lolipop on 3/10/2018.
 */

public class EUR {

    @SerializedName("source_amount_min")
    @Expose
    private int sourceAmountMin;
    @SerializedName("source_amount_max")
    @Expose
    private int sourceAmountMax;
    @SerializedName("wholesale_fx_rate")
    @Expose
    private float wholesaleFxRate;

    public int getSourceAmountMin() {
        return sourceAmountMin;
    }

    public void setSourceAmountMin(int sourceAmountMin) {
        this.sourceAmountMin = sourceAmountMin;
    }

    public int getSourceAmountMax() {
        return sourceAmountMax;
    }

    public void setSourceAmountMax(int sourceAmountMax) {
        this.sourceAmountMax = sourceAmountMax;
    }

    public float getWholesaleFxRate() {
        return wholesaleFxRate;
    }

    public void setWholesaleFxRate(float wholesaleFxRate) {
        this.wholesaleFxRate = wholesaleFxRate;
    }
}
