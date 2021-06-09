package saini.ayush.playerground.animations

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import saini.ayush.playerground.R

class AnimActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_anim)

    val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
    recyclerView.layoutManager = LinearLayoutManager(this)

    val items = ArrayList<AnimItem>()

    items.add(
        AnimItem(getString(R.string.title_no_animation),
      Intent(this, NoAnimationActivity::class.java)
    )
    )


    items.add(
        AnimItem(getString(R.string.title_launch_rocket),
      Intent(this, LaunchRocketValueAnimatorAnimationActivity::class.java))
    )

   items.add(
       AnimItem(getString(R.string.title_color_animation),
     Intent(this, ColorAnimationActivity::class.java))
   )

    recyclerView.adapter = RocketAdapter(this, items)

  }
}
