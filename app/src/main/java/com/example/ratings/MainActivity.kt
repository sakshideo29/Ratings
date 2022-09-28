package com.example.ratings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ratingBar.setonRatingBarChangeListener{ratingaBar,f1,b->
            textview.setText("Rating=$f1")


        }
    }
}