package ui.tutorials.myrecipeapp

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.Retrofit.Builder
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET




private val retrofit = Builder().
    baseUrl("www.themealdb.com/api/json/v1/1/")
    .addConverterFactory(GsonConverterFactory.create()).build()


val recipeService = retrofit.create(ApiService::class.java)



interface ApiService{
    @GET("categories.php")
    suspend fun getCategories():CategoriesResponse


}