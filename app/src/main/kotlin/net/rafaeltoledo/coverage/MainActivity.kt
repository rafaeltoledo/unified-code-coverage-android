package net.rafaeltoledo.coverage

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = findViewById<TextView>(R.id.text)
        findViewById<Button>(R.id.button).setOnClickListener {
            text.text = "Hello World!"
        }

        findViewById<Button>(R.id.hide).setOnClickListener {
            it.visibility = View.GONE
        }
    }
}