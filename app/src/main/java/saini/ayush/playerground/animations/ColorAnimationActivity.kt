package saini.ayush.playerground.animations

import android.animation.ArgbEvaluator
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.os.Bundle
import androidx.core.content.ContextCompat
import saini.ayush.playerground.R

class ColorAnimationActivity : BaseAnimationActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onStartAnimation() {

        val objectAnimator = ObjectAnimator.ofObject(
            frameLayout,
            "backgroundColor",
            ArgbEvaluator(),
            ContextCompat.getColor(this, R.color.background_from),
            ContextCompat.getColor(this, R.color.background_to)
        )

        objectAnimator.repeatCount = 0
        objectAnimator.repeatMode = ValueAnimator.RESTART

        objectAnimator.duration = DEFAULT_ANIMATION_DURATION
        objectAnimator.start()

    }

}
