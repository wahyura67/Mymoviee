package com.example.wahyurunnianto.mymoviee.api;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Client {

    public static final String BASE_URL = "https://api.themoviedb.org/3/movie/550?api_key=f7b67d9afdb3c971d4419fa4cb667fbf";
    public static Retrofit retrofit= null;

    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
    }
