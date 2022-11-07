package com.example.madpractical8_21012022010

import android.graphics.drawable.AnimationDrawable
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashActivity : AppCompatActivity() ,Animation.AnimationListener{
    lateinit var logo_image: ImageView
    lateinit var logo_framebyframeanimation: AnimationDrawable
    lateinit var twinaimation: Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        logo_image = findViewById(R.id.image)
        logo_image.setBackgroundResource(R.drawable.uvpce_logo_list)
        logo_framebyframeanimation=logo_image.background as AnimationDrawable
        twinaimation=AnimationUtils.loadAnimation(this,R.anim.twin_animation)
        twinaimation.setAnimationListener(this)
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus)
            {logo_framebyframeanimation.start()
            logo_image.startAnimation(twinaimation)
        }
        else{

                logo_framebyframeanimation.stop() }
        }

    override fun onAnimationStart(p0: Animation?) {

    }

    override fun onAnimationEnd(p0: Animation?) {

    }

    override fun onAnimationRepeat(p0: Animation?) {

    }

}
