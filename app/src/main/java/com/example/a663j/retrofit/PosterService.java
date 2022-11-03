package com.example.a663j.retrofit;

import com.example.a663j.model.Employee;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface PosterService {

    @Headers(
            "Content-type:application/json"
    )

    @GET("employees")
    Call<ArrayList<PosterResponse>> get();

    @GET("employee/1")
    Call<PosterResponse> getSingle(@Path("id") Employee employee);

    @POST("create")
    Call<PosterResponse> post(@Body Employee employee);

    @PUT("update/21{id}")
    Call<PosterResponse> put(@Path("id") int id, @Body Employee employee);

    @DELETE("delete/2{id}")
    Call<PosterResponse> delete(@Path("id") int id);
}
