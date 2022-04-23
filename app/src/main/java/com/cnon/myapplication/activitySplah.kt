package com.cnon.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class activitySplah : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splah)
        getSupportActionBar()?.hide();


        val asagidanGelenButon = AnimationUtils.loadAnimation(this,R.anim.buttonyukari)
        val button = findViewById<Button>(R.id.button2)
        val yukaridanGelenResim = AnimationUtils.loadAnimation(this,R.anim.resimasagi)
        val yukariyaGidenResim = AnimationUtils.loadAnimation(this,R.anim.resimyukari)
        val resim = findViewById<ImageView>(R.id.balon)
        button.animation = asagidanGelenButon;
        resim.animation = yukaridanGelenResim;
        val asagiGidenButon = AnimationUtils.loadAnimation(this,R.anim.buttonasagi)

        button.setOnClickListener {
            //resim.animation = yukariyaGidenResim
            resim.startAnimation(yukariyaGidenResim)
            button.startAnimation(asagiGidenButon)
            println("butona basıldı")

            object : CountDownTimer(1500, 1500)
            {
                override fun onTick(p0: Long) {

                }

                override fun onFinish() {

                    var intent = Intent(applicationContext,MainActivity::class.java)
                    startActivity(intent)
                }

            }.start()


        }


        
    }
}