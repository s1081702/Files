package tw.edu.pu.s1081702.files

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule
import com.bumptech.glide.request.target.CustomTarget
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import kotlinx.android.synthetic.main.activity_main.*
import java.io.ByteArrayOutputStream


@GlideModule
public final class MyAppGlideModule : AppGlideModule()


class QuestionActivity : AppCompatActivity() {

    lateinit var img: ImageView

    var db = FirebaseFirestore.getInstance()
    var user: MutableMap<String, Any> = HashMap()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        img = findViewById(R.id.imgtest)
        //val bmp: Bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.map_drawing)
        //img.setImageBitmap(bmp)
        GlideApp.with(this)
            .asBitmap()
            .load(R.drawable.map_drawing)
            .into(object : CustomTarget<Bitmap>() {
                override fun onResourceReady(
                    resource: Bitmap,
                    transition: com.bumptech.glide.request.transition.Transition<in Bitmap>?
                ) {
                    img.setImageBitmap(resource)
                    SaveToStorage(resource)

                }

                override fun onLoadCleared(placeholder: Drawable?) {
                }
            })
    }


        fun SaveToStorage(bmp:Bitmap){
            //將圖片換成byteArray
            val baos = ByteArrayOutputStream()
            bmp.compress(Bitmap.CompressFormat.JPEG, 100, baos)
            val pictData = baos.toByteArray()

            val filename = "images/map_drawing.jpg"  //設定子節點與檔名
            val reference = FirebaseStorage.getInstance().getReference().child(filename)
            //上傳到Firebase
            reference.putBytes(pictData)
                .addOnSuccessListener {
                    Toast.makeText(baseContext, "上傳成功", Toast.LENGTH_SHORT).show()
                }

                .addOnFailureListener {
                    Toast.makeText(baseContext, "上傳失敗", Toast.LENGTH_SHORT).show()
                }
        }




}