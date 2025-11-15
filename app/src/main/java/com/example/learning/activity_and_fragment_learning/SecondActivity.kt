package com.example.learning.activity_and_fragment_learning

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.learning.MainActivity
import com.example.learning.R
import com.example.learning.databinding.ActivityMainBinding
import com.example.learning.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)


        Log.i("kekSECOND","onCreate")


        binding.intentToMain.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }

    override fun onStart() {
        super.onStart()
        Log.i("kekSECOND","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("kekSECOND","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("kekSECOND","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("kekSECOND","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("kekSECOND","onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i("kekSECOND","onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i("kekSECOND","onRestoreInstanceState")
    }


    override fun onRestart() {
        super.onRestart()
        Log.i("kekSECOND","onRestart")
    }

    @SuppressLint("GestureBackNavigation")
    override fun onBackPressed() {
        super.onBackPressed()
        Log.i("kekSECOND","onBackPressed")
    }


}