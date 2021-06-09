package saini.ayush.playerground.custom_views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*
import saini.ayush.playerground.R
import saini.ayush.playerground.animations.EmotionalFaceView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        happyButton.setOnClickListener {
            face.happinessState = EmotionalFaceView.HAPPY
        }

        sadButton.setOnClickListener {
            face.happinessState = EmotionalFaceView.SAD
        }

    }
}