package com.example.volumecalculator

import android.content.Context
import android.graphics.drawable.shapes.Shape
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// it act as a bridge between data source and the grid view
class MyCustomAdapter(context: Context,private val griditems : List<com.example.volumecalculator.Shape>):
    ArrayAdapter<com.example.volumecalculator.Shape>(context,0,griditems) {
        // 0 is used because we are not using pre defined layout
        // griditems is a parameter that adapter will adapt to list view or grid view
        // griditems-> is a list of shape that contains information of image and textview
        // context requries the access resources and layout

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var itemView=convertView
        val holder : ViewHolder
        if(itemView==null){
            itemView=LayoutInflater.from(context).inflate(R.layout.grid_item_layout,parent,false)
            holder=ViewHolder()
            holder.imageView=itemView.findViewById(R.id.imageview)
            holder.textView=itemView.findViewById(R.id.textview)

            // avoiding the need to create a new viewholder everytime
            itemView.tag=holder
        }else{
            holder= itemView.tag as ViewHolder
        }

        // Binding data to views
        val currentItem=griditems[position]
        holder.imageView.setImageResource(currentItem.shapeimg)
        holder.textView.text=currentItem.shapename
        return itemView!!
        // !! -> NON NULL ASSERTION OPERATOR
    }

    private class ViewHolder{
        // a design pattern used to improve the performance of listview gridview recyclerview
        // and other by cachng views for smoother scrolling
        lateinit var imageView: ImageView
        lateinit var textView: TextView

    }

}




