package com.basic.apical;

import com.eru.pojo.EroResponce;
import com.pojo.CountryResponce;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;


/**
 * Created by lolipop on 3/9/2018.
 */

public interface LoginService {

    @GET("v1/money-transfer/countries")
    Call<ArrayList<CountryResponce>> getCountries();

}
