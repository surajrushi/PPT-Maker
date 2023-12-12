package com.example.ppt

import android.graphics.ImageDecoder.ImageInfo
import android.media.ImageReader
import android.os.Build
import androidx.annotation.RequiresApi
import com.google.gson.JsonArray
import javax.*
import com.google.gson.JsonParser
import com.google.gson.stream.JsonReader
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope
import org.apache.poi.ss.util.ImageUtils
import org.jsoup.Jsoup
import java.io.BufferedReader
import java.io.FileReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder
import java.util.Properties
import java.util.stream.Collectors


class RetrofitData {
}

fun main() {

    val jsonParser =
        JsonParser.parseReader(FileReader("C:\\Users\\SALUNRN\\Desktop\\Rushikesh\\AndroidStudioProjects\\ppt2\\app\\src\\main\\assets\\result.json"))
    for (i in 0..jsonParser.asJsonArray.size() - 1) {
        println("slide no:$i")
        println(jsonParser.asJsonArray.get(i).asJsonObject.get("slide_no"))
        println("Title")
        val str = jsonParser.asJsonArray.get(i).asJsonObject.get("title").toString()

        println(str.substring(1,str.length-1))
        //executeQuery(query = jsonParser.asJsonArray.get(i).asJsonObject.get("title").toString())
        getImageFromQuery(str.substring(1,str.length-1))
        println("Content")
        println(jsonParser.asJsonArray.get(i).asJsonObject.get("content"))
        println()
    }




}
fun getImageFromQuery(query:String){
    try {
        val url =
            URL("https://www.googleapis.com/customsearch/v1?key=" + "AIzaSyBiEQPGIm-bguktppBkTL6OQvI8671gsiM" + "&cx=530511ee58e724937" + "&q=" + query.replace(" ","+"))
        val connection = url.openConnection() as HttpURLConnection
        connection.requestMethod = "GET"
        val responseCode = connection.responseCode
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader(InputStreamReader(connection.inputStream)).use { reader ->
                val response =
                    reader.lines().collect(Collectors.joining())
                val parser = JsonParser()
                val jsonReader = JsonReader(response.reader())
                val jsonArray: JsonArray =
                    parser.parse(jsonReader).getAsJsonObject().get("items") as JsonArray
                println(jsonArray.get(1).asJsonObject.get("pagemap").asJsonObject.get("cse_image").asJsonArray.get(0).asJsonObject.get("src"))


            }

        } else {
            println("Error: ${connection.responseMessage}")
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
}


fun executeQuery(query:String){
    val encodeQuery = URLEncoder.encode(query,"UTF-8")
     val document =
        Jsoup.connect("https://www.google.co.in/search?biw=1366&bih=675&tbm=isch&sa=1&ei=qFSJWsuTNc-wzwKFrZHoCw&q=$encodeQuery")
            .get()
    val imgs = document.select("img")
    for (image in imgs) {
        val s = image.attr("src")
        if (s.contains("encrypted")) {
            println(s)
            return
        }

    }
}


//    val retrofit = Retrofit.Builder()
//        .baseUrl("https://generativelanguage.googleapis.com/v1beta3/")
//        .addConverterFactory(GsonConverterFactory.create())
//        .build()
//
//    val apiService = retrofit.create(RetroAPI::class.java)
//
//    val requestData = Prompt("android development")
//
//    val call = apiService.generateText("AIzaSyBmq372t0Og8IrAd7S6QC0c_evh9Fwy0HY",requestData)
//
//    call.enqueue(object : Callback<PromptResponse> {
//        override fun onResponse(call: Call<PromptResponse>, response: Response<PromptResponse>) {
//            if (response.isSuccessful) {
//                val promptResponse = response.body()
//                println(promptResponse)
//            } else {
//                 println(response.toString())
//
//            }
//             println(response.toString())
//        }
//
//        override fun onFailure(call: Call<PromptResponse>, t: Throwable) {
//            println(t.toString())
//
//        }
//    })
//
//}