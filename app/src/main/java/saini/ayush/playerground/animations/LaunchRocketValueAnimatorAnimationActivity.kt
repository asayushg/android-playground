package saini.ayush.playerground.animations

import android.animation.AnimatorSet
import android.animation.ValueAnimator
import android.os.Bundle
import android.os.PersistableBundle
import saini.ayush.playerground.R

class LaunchRocketValueAnimatorAnimationActivity : BaseAnimationActivity(){

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_base_animation)

        rocket = findViewById(R.id.rocket)
        doge = findViewById(R.id.doge)
        frameLayout = findViewById(R.id.container)

        frameLayout.setOnClickListener {
            onStartAnimation()
        }

    }

    override fun onStartAnimation() {

     //  val valueAnimator = ValueAnimator.ofFloat(0f, -screenHeight)
     //  valueAnimator.addUpdateListener {
     //      val value = it.animatedValue as Float
     //      rocket.translationY = value
     //      doge.translationY = value
     //  }

     //  valueAnimator.interpolator = BounceInterpolator()
     //  valueAnimator.duration = DEFAULT_ANIMATION_DURATION

     //  valueAnimator.start()

        val positionAnimator = ValueAnimator.ofFloat(0f, -screenHeight)
        positionAnimator.addUpdateListener {
            val value = it.animatedValue as Float
            rocket.translationY = value
            doge.translationY = value
        }

//2
        val rotationAnimator = ValueAnimator.ofFloat(0f, 360f)
        rotationAnimator.addUpdateListener {
            val value = it.animatedValue as Float
            doge.rotation = value
        }

//3
        val animatorSet = AnimatorSet()
        animatorSet.play(positionAnimator).with(rotationAnimator)
        animatorSet.duration = DEFAULT_ANIMATION_DURATION
        animatorSet.start()

    }

}
