package com.android.mvisample.data.api

import com.android.mvisample.data.model.User
import retrofit2.Response

interface ApiHelper {

    suspend fun getUsers(): Response<List<User>>

}