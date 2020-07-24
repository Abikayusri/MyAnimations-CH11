package abika.sinau.myanimations

import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_animated_vector_drawable.*

class AnimatedVectorDrawable : AppCompatActivity() {

    var flag = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animated_vector_drawable)

        animatedVector.setOnClickListener {
            updateButton()
        }
    }

    private fun updateButton() {
        animatedVector.setImageResource(
            if (flag) {
                R.drawable.avd_check_cancel
            } else {
                R.drawable.avd_cancel_check
            }
        )
        val icon = animatedVector.drawable
        flag = !flag
        if (icon is AnimatedVectorDrawable) {
            icon.start()
        }
    }
}