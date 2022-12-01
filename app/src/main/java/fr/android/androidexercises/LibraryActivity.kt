package fr.android.androidexercises

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import timber.log.Timber


class LibraryActivity : AppCompatActivity() {

    suspend fun loadAsync(service:HenriPotierService){
        val books = service.listBooksAsync()
        println(books)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)

        // Plant logger cf. Android Timber
        val timber = Timber.plant(Timber.DebugTree())

        // build Retrofit
        val retrofit = Retrofit.Builder()
            .baseUrl("https://henri-potier.techx.fr")
            // retrofit est l'orchestrateur
            // le client HTTP peut être intercepté avec le client suivant
            //.client(OkHttpClient.Builder().build())
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        // create a service
        val service: HenriPotierService = retrofit.create(HenriPotierService::class.java)

        // listBooks()
        val booksCall: Call<List<Book>> = service.listBooks();

        // enqueue call and display book title
        val books = booksCall.enqueue(object : Callback<List<Book>> {
            override fun onResponse(call: Call<List<Book>>, response: Response<List<Book>>) {
                Timber.v("${response.body()}")
                response.body()?.map{
                    Timber.i(it.title)
                }
            }

            override fun onFailure(call: Call<List<Book>>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })

        // log books
        Timber.v(books.toString())

        // TODO display book as a list

    }

}
