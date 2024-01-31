package com.dicoding.aplikasiku.githubuserssearch.api

import com.dicoding.aplikasiku.githubuserssearch.data.model.DetailUserResponse
import com.dicoding.aplikasiku.githubuserssearch.data.model.User
import com.dicoding.aplikasiku.githubuserssearch.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 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")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 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")
    fun getUserDetail(
        @Path("username") username: String?
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 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")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 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")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}