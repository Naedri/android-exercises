package fr.android.androidexercises

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class BookActivity : AppCompatActivity() {

    private val bookName = "Garry Whopper"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)

        val messageTextView = findViewById<TextView>(R.id.messageTextView)
        messageTextView.text = bookName

        val sendNameButton = findViewById<Button>(R.id.sendNameButton)
        sendNameButton.setOnClickListener {
            Intent
            Toast.makeText(this@LibraryActivity, R.string.toast_todo, Toast.LENGTH_SHORT).show()

            // TODO set result to book name in intent
            // TODO finish current activity
        }
    }
}
