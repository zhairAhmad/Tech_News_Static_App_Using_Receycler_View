package com.example.technews

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ArticleDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_article_details)
       val title:String? = intent.getStringExtra("title")
        val category:String? = intent.getStringExtra("category")
        val date:String? = intent.getStringExtra("date")
        val image:Int = intent.getIntExtra("image",0)
        val detail:String? = intent.getStringExtra("detail")

         findViewById<TextView>(R.id.titled).text = title
         findViewById<TextView>(R.id.categoryD).text = category
         findViewById<TextView>(R.id.datee).text = date
        findViewById<TextView>(R.id.detailsd).text = detail

            findViewById<ImageView>(R.id.FrontImaged).setImageResource(image)

    }
}