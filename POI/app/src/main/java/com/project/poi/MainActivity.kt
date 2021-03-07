package com.project.poi

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val activity_reg = Intent(this,Registro::class.java)
        val activity_home = Intent(this,Home::class.java)


        lbl_inicio.setOnClickListener { startActivity(activity_reg)}

        btn_signin.setOnClickListener { startActivity(activity_home) }

}



}
