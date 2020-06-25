package com.androindian.movekotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Movetosecond.setOnClickListener {
            var intent= Intent(this@MainActivity,Second::class.java)
            startActivity(intent)
        }
    }
}