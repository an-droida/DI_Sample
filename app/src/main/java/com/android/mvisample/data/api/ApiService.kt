package com.android.mvisample.data.api

import com.android.mvisample.data.model.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

   @GET("users")
   suspend fun getUsers(): Response<List<User>>
}