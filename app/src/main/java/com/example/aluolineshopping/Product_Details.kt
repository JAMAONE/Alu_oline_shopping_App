package com.example.aluolineshopping

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_product__details.*
import kotlinx.android.synthetic.main.shopping_ticket.*

class Product_Details : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product__details)

        //Declaration of items to bbe displayed in this activity
        var  bundle = intent.extras
        iv_image1.setImageResource(bundle!!.getInt("image"))
        tv_name1.text= bundle!!.getString("name")
        tv_des.text= bundle!!.getString("des")
    }
}
