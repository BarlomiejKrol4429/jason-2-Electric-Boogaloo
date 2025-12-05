package com.example.jason;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JavaPlaceHolderApi {
    @GET("pytania")
    public Call<List<Pytanie>> getPytania();
}
