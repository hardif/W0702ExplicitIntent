package kr.ac.kumoh.S20180735

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ImageActivity : AppCompatActivity() {
    private lateinit var imageActivity: ImageActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)
    }
}