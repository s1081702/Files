package tw.edu.pu.s1081702.files

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_story.*

class StoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story)

        backB.setOnClickListener(object :View.OnClickListener{
            override fun onClick(p0:View?){
                intent = Intent(this@StoryActivity, MainActivity::class.java)
                startActivity(intent)
            }
        })

        type1btn.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {
               imgstory1.setImageResource(R.drawable.test3);
                /*if(imgstory1.visibility ==View.GONE){
                    imgstory1.setImageResource(R.drawable.test3);
                }*/
            }

        })

        type2btn.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {
               imgstory2.setImageResource(R.drawable.test4);
            }

        })

    }

}



