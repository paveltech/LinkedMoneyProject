package com.eru.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by lolipop on 3/10/2018.
 */

public class EroResponce {

    @SerializedName("destination_currency")
    @Expose
    private String destinationCurrency;
    @SerializedName("rates")
    @Expose
    private Rates rates;

    public String getDestinationCurrency() {
        return destinationCurrency;
    }

    public void setDestinationCurrency(String destinationCurrency) {
        this.destinationCurrency = destinationCurrency;
    }

    public Rates getRates() {
        return rates;
    }

    public void setRates(Rates rates) {
        this.rates = rates;
    }
}
