package net.rafaeltoledo.coverage

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = findViewById<TextView>(R.id.text)
        findViewById<Button>(R.id.button).setOnClickListener {
            text.text = "Hello World!"
        }

        findViewById<Button>(R.id.hide).setOnClickListener {
            it.visibility = View.GONE
        }
    }
}