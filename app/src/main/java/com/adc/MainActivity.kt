package com.adc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.Toast
import com.adc.databinding.ActivityMainBinding
import kotlin.math.log

class MainActivity :AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShowToast.setOnClickListener {
            Log.i("MainActivity","Button was clicked")
            Toast.makeText(this,"Button was clicked!",Toast.LENGTH_LONG).show()
        }

        binding.btnSendMsgToNextActivity.setOnClickListener {



            val message: String = binding.etUserMessage.text.toString()
            Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
        }
    }
}