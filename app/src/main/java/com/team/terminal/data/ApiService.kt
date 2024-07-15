package com.team.terminal.data

import com.team.terminal.presentation.TimeFrame
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("aggs/ticker/AAPL/range/{timeFrame}/2023-01-09/2023-02-10?adjusted=true&sort=desc&limit=50000&apiKey=TuYysmWTZ5ODLD52nCZfFNj1qpzIOh8k")
    suspend fun loadBars(
        @Path("timeFrame") timeFrame: String
    ): Result
}