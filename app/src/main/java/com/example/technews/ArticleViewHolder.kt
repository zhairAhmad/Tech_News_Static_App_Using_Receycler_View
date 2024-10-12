package com.example.technews
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ArticleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
val frontImage: ImageView = itemView.findViewById(R.id.frontImage)
    val title: TextView = itemView.findViewById(R.id.headline)
    val category: TextView = itemView.findViewById(R.id.category)

}

