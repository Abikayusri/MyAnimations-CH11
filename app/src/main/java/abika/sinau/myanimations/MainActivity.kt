package abika.sinau.myanimations

import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    //TextView
    lateinit var txtMessage: TextView

    //Button
    lateinit var btn: Button

    // Animation
    lateinit var animFadein: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtMessage = findViewById(R.id.text)
        btn = findViewById(R.id.btn)
        //loading Animation
        animFadein = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.fade_in
        )

        //handling aniamtion on button click
        btn.setOnClickListener {
            txtMessage.visibility = View.VISIBLE
            // starting the animation
            txtMessage.startAnimation(animFadein)
        }
    }
}