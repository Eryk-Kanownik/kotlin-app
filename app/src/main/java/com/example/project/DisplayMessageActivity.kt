package com.example.project

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity

class DisplayMessageActivity: ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        val name = intent.getStringExtra("name");
        val lastname = intent.getStringExtra("last_name")
        val album_number = intent.getStringExtra("album_number");
        val year = intent.getStringExtra("year")

        findViewById<TextView>(R.id.name).text = name;
        findViewById<TextView>(R.id.student_lastname).text = lastname;
        findViewById<TextView>(R.id.student_album_number).text = album_number;
        findViewById<TextView>(R.id.student_year).text = year;

        var btn = findViewById<Button>(R.id.btn_show_author);

        btn.setOnClickListener({
            val toastText = "Twórca: Eryk Kanownik, 83759";
            Toast.makeText(this,toastText,Toast.LENGTH_LONG).show();
        })
    }
}