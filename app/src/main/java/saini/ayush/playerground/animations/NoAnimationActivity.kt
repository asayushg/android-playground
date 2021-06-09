package saini.ayush.playerground.animations

import android.os.Bundle
import saini.ayush.playerground.R

class NoAnimationActivity : BaseAnimationActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base_animation)
    }

    override fun onStartAnimation() {

    }
}