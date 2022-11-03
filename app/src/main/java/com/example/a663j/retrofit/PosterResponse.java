package com.example.a663j.retrofit;

import com.google.gson.annotations.SerializedName;

public class PosterResponse {

    @SerializedName("id")
    int id = 0;
    @SerializedName("userId")
    int userId;
    @SerializedName("employee_name")
    String employee_name;
    @SerializedName("employee_salary")
    int employee_salary;
    @SerializedName("employee_age")
    int employee_age;
    @SerializedName("profile_image")
    String profile_image;
}
