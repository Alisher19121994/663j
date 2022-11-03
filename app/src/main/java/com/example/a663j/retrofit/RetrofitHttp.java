package com.example.a663j.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitHttp {

    public static boolean IS_TESTER = true;
    private static String SERVER_DEVELOPMENT = "https://dummy.restapiexample.com/api/v1/";
    private static String SERVER_PRODUCTION = "https://dummy.restapiexample.com/api/v1/";

    public static String server() {
        if (IS_TESTER) {
            return SERVER_DEVELOPMENT;
        }
        return SERVER_PRODUCTION;
    }

    public static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(server())
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public static PosterService posterService = retrofit.create(PosterService.class);
}
