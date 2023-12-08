package com.example.project

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        var btn = findViewById<Button>(R.id.btn_go);
        btn.setOnClickListener{
            val name = findViewById<EditText>(R.id.name).text.toString()
            val lastName = findViewById<EditText>(R.id.lastname).text.toString()
            val albumNumber = findViewById<EditText>(R.id.album_number).text.toString()
            val year = findViewById<EditText>(R.id.year).text.toString()

            if(name.length == 0 || lastName.length == 0 || albumNumber.length == 0 || year.length == 0){
                Toast.makeText(this,"Wszytkie pola muszą być wypełnione", Toast.LENGTH_LONG).show();
            } else {
                var intent = Intent(this, DisplayMessageActivity::class.java)
                intent.putExtra("name",name)
                intent.putExtra("last_name",lastName)
                intent.putExtra("album_number",albumNumber)
                intent.putExtra("year",year)
                startActivity(intent);
            }

        }
    }
}
