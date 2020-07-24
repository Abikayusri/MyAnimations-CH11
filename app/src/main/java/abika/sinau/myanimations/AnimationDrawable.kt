package abika.sinau.myanimations

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class AnimationDrawable : AppCompatActivity(){

//    private lateinit var rocketAnimation: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        imageView.setBackgroundResource(R.drawable.custom_animation)
        val animation = imageView.background as AnimationDrawable
        animation.start()
    }
}