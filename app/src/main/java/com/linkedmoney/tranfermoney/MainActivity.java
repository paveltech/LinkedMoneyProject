package com.linkedmoney.tranfermoney;


import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Toast;

import com.basic.apical.BasicAuthInterceptor;
import com.basic.apical.LoginService;
import com.basic.apical.ServiceGenerator;
import com.pojo.CountryResponce;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    /***
     *
     *Here is the Test API Credentials for you to start APPS DEVELOPMENT
     "API_KEY": 'a89fd8a6-3ea4-575b-a535-5c7607497cdc'
     "API_SECRET": '5585c839-8045-51bb-99e2-d848f7c75826'
     * @para
     * .lasdf;lj;lskdas;ljfsafd;ljm savedInstanceState
     */

    public String api_key = "";
    public String api_secret = "";
    public ArrayList<CountryResponce> countryResponces;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        countryResponces = new ArrayList<>();


        final LoginService loginService = ServiceGenerator.createService(LoginService.class , api_key , api_secret);
        Call<ArrayList<CountryResponce>> call = loginService.getCountries();
        Log.d("url" , ""+call.request().url().toString());
        call.enqueue(new Callback<ArrayList<CountryResponce>>() {
            @Override
            public void onResponse(Call<ArrayList<CountryResponce>> call, Response<ArrayList<CountryResponce>> response) {

                Toast.makeText(MainActivity.this, ""+response.isSuccessful(), Toast.LENGTH_SHORT).show();

                if (response.isSuccessful()){

                    countryResponces = response.body();
                    Log.d("result" , ""+countryResponces);
                }
                else {
                    Toast.makeText(MainActivity.this, "Not successful", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ArrayList<CountryResponce>> call, Throwable t) {
                Log.d("error" , ""+call);
            }
        });

        /*
        CallApi callApi = new CallApi();
        callApi.execute();
        */

    }





    public class CallApi extends AsyncTask<Void , Void , Void>{

        Retrofit retrofit;
        OkHttpClient client;

        @Override
        protected Void doInBackground(Void... voids) {
            client = new OkHttpClient.Builder()
                    .addInterceptor(new BasicAuthInterceptor("a89fd8a6-3ea4-575b-a535-5c7607497cdc", "5585c839-8045-51bb-99e2-d848f7c75826"))
                    .build();

            retrofit = new Retrofit.Builder()
                    .baseUrl("https://api-pre.mm.transferto.com/")
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            LoginService countryService = retrofit.create(LoginService.class);
            try {

                //System.out.println(countryService.basicLogin().execute().body());

                countryResponces = countryService.getCountries().execute().body();

            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            Log.d("result"  , ""+countryResponces);

        }
    }


}


