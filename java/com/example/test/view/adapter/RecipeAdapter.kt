package com.example.test.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R

class RecipeAdapter : RecyclerView.Adapter<RecipeAdapter.ViewHolder>() {

    // ranger tous les composants
    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        val RecipeImage = view.findViewById<ImageView>(R.id.menu_vertical_item)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.menu_vertical, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int = 30
}