
package tw.edu.pu.s1081702.files

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TaichungB.setOnClickListener(object :View.OnClickListener{
            override fun onClick(p0:View?){
                intent = Intent(this@MainActivity, QuestionActivity::class.java)
                startActivity(intent)
            }
        })

        PingtungB.setOnClickListener(object :View.OnClickListener{
            override fun onClick(p0:View?){
                intent = Intent(this@MainActivity, QuestionActivity::class.java)
                startActivity(intent)
            }
        })

        KaohsiungB.setOnClickListener(object :View.OnClickListener{
            override fun onClick(p0:View?){
                intent = Intent(this@MainActivity, StoryActivity::class.java)
                startActivity(intent)
            }
        })

    }



}