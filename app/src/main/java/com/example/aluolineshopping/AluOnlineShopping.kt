package com.example.aluolineshopping

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class AluOnlineShopping : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alu_online_shopping)


        Handler().postDelayed({
            startActivity(Intent(this@AluOnlineShopping,MainActivity::class.java))

            finish()
        },3000) //3sec
    }
}
