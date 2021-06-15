package tw.edu.pu.s1081702.files

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule

@GlideModule
public final class MyAppGlideModule : AppGlideModule()

class StoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story)





        fun story1Tapped(view: View) {
            val img: ImageView = findViewById(R.id.imgstory1)
            GlideApp.with(this)
                .load(R.drawable.test3)
                .into(img)

        }

        fun story2Tapped(view: View) {

        }
    }
}