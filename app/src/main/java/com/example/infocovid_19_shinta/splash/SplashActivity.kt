package com.example.infocovid_19_shinta.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.infocovid_19_shinta.R
import com.example.infocovid_19_shinta.activity.MainActivity
import org.jetbrains.anko.startActivity

class SplashActivity : AppCompatActivity() {
    private val splasscreentimeout:Long =3000

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_splash)

            Handler().postDelayed({
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }, splasscreentimeout)
    }


}