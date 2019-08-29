package com.example.wahyurunnianto.mymoviee.api;

import com.example.wahyurunnianto.mymoviee.model.MoviesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Service {
    @GET("movie/popular")
    Call<MoviesResponse> getPopularMovies(@Query("66f3cbce0f1109029c5bcdb0a8270650") String apiKey, @Query("page") int pageIndex);

    @GET("movie/top_rated")
    Call<MoviesResponse> getTopRatedMovies(@Query("66f3cbce0f1109029c5bcdb0a8270650") String apiKey, @Query("page") int pageIndex);

}
