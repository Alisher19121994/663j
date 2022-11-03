package com.example.a663j;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.a663j.model.Employee;
import com.example.a663j.retrofit.PosterResponse;
import com.example.a663j.retrofit.RetrofitHttp;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
    public void initViews(){
        Employee employee = new Employee(1,"Alisher","",500,27);
        Employee employeePOST = new Employee(1,"AlisherBEK","",500,27);
        Employee employeePUT = new Employee(1,"Alisher Daminov","",500,27);


        apiList();
        //apiSingle(employee);
        //apiPost(employeePOST);
        //apiPut(employeePUT);
        //apiDelete(employee);
    }
    void apiList(){
        RetrofitHttp.posterService.get().enqueue(new Callback<ArrayList<PosterResponse>>() {
            @Override
            public void onResponse(Call<ArrayList<PosterResponse>> call, Response<ArrayList<PosterResponse>> response) {
                Log.d("RetrofitHttp",response.body().toString());
            }

            @Override
            public void onFailure(Call<ArrayList<PosterResponse>> call, Throwable t) {
                Log.d("RetrofitHttp",t.toString());
            }
        });
    }

    void apiSingle(Employee employee){
        RetrofitHttp.posterService.getSingle(employee).enqueue(new Callback<PosterResponse>() {
            @Override
            public void onResponse(Call<PosterResponse> call, Response<PosterResponse> response) {
                Log.d("RetrofitHttp",response.body().toString());
            }

            @Override
            public void onFailure(Call<PosterResponse> call, Throwable t) {
                Log.d("RetrofitHttp",t.toString());
            }
        });
    }
    void apiPost(Employee employee){
        RetrofitHttp.posterService.post(employee).enqueue(new Callback<PosterResponse>() {
            @Override
            public void onResponse(Call<PosterResponse> call, Response<PosterResponse> response) {
                Log.d("RetrofitHttp",response.body().toString());
            }

            @Override
            public void onFailure(Call<PosterResponse> call, Throwable t) {
                Log.d("RetrofitHttp",t.toString());
            }
        });
    }

    void apiPut(Employee employee){
        RetrofitHttp.posterService.put(employee.getId(),employee).enqueue(new Callback<PosterResponse>() {
            @Override
            public void onResponse(Call<PosterResponse> call, Response<PosterResponse> response) {
                Log.d("RetrofitHttp",response.body().toString());
            }

            @Override
            public void onFailure(Call<PosterResponse> call, Throwable t) {
                Log.d("RetrofitHttp",t.toString());
            }
        });
    }
    void apiDelete(Employee employee){
        RetrofitHttp.posterService.delete(employee.getId()).enqueue(new Callback<PosterResponse>() {
            @Override
            public void onResponse(Call<PosterResponse> call, Response<PosterResponse> response) {
                Log.d("RetrofitHttp",response.body().toString());
            }

            @Override
            public void onFailure(Call<PosterResponse> call, Throwable t) {
                Log.d("RetrofitHttp",t.toString());
            }
        });
    }
}