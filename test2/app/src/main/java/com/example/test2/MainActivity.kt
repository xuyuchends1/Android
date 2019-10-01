package com.example.test2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_variable.setOnClickListener { setContentView(R.layout.activity_array) };
        btn_array.setOnClickListener { setContentView(R.layout.activity_array) }

    }
}
