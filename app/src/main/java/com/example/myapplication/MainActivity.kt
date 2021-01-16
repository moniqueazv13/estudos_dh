package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)
       mensagem()

    }

    private fun mensagem() {
        val snackbar = Snackbar.make(findViewById(R.id.myCoordinatorLayout), "Hello snackbar world!", Snackbar.LENGTH_LONG)
        snackbar.show()    }


}