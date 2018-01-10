package com.example.suleman_pc.bookssharingapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by suleman-pc on 12/25/2017.
 */

public interface Api  {
    @GET("api/book")
    Call<List<Book>> getBooks();
}
