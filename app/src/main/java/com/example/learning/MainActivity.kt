package com.example.learning

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.learning.activity_and_fragment_learning.SecondActivity
import com.example.learning.databinding.ActivityMainBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("kekFIRST","onCreate1-Activity")
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.e("kekFIRST","onCreate2-Activity")

//        binding.intentToSecond.setOnClickListener {
//            startActivity(Intent(this, SecondActivity::class.java))
//    //            finish()
//    //            showSimpleDialog()
//        }
//
//
//        binding.intentToSecond.setOnClickListener {
//            startActivity(Intent(this, SecondActivity::class.java))
//        }

    }

    private fun showSimpleDialog() {
        AlertDialog.Builder(this)
            .setTitle("Diqqət")
            .setMessage("Bu bir sadə mesajdır. Razısınız?")
            .setPositiveButton("Bəli") { dialog, _ ->
                Toast.makeText(this, "Bəli seçildi", Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            }
            .setNegativeButton("Xeyr") { dialog, _ ->
                Toast.makeText(this, "Xeyr seçildi", Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            }
            .setCancelable(true)
            .show()
    }

    private fun showBottomSheet() {
        val bottomSheet = BottomSheetDialog(this)
        bottomSheet.setContentView(R.layout.bottom_sheet_layout)
        bottomSheet.show()
        // Bu nöqtədə Activity hələ də RESUMED state-dədir
        // onPause() və ya onStop() çağrılmayacaq
    }

    override fun onContentChanged() {
        super.onContentChanged()
        Log.e("kekFIRST","onContentChanged-Activity")
    }

    override fun onStart() {
        super.onStart()
        Log.e("kekFIRST","onStart-Activity")
    }

    override fun onResume() {
        super.onResume()
        Log.e("kekFIRST","onResume-Activity")
    }

    override fun onPause() {
        super.onPause()
        Log.e("kekFIRST","onPause-Activity")
    }

    override fun onStop() {
        super.onStop()
        Log.e("kekFIRST","onStop-Activity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("kekFIRST","onDestroy-Activity")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.e("kekFIRST","onSaveInstanceState-Activity")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.e("kekFIRST","onRestoreInstanceState-Activity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("kekFIRST","onRestart-Activity")
    }




















}
