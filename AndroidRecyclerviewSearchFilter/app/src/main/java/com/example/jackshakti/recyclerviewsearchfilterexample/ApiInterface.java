package com.example.jackshakti.recyclerviewsearchfilterexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("3afeec8d-d083-42dc-97dd-399f9f265b91")
    Call<List<Movie>> getMovies();
}
