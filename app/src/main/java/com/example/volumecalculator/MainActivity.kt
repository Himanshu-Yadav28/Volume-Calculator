package com.example.volumecalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // view
        val gridView : GridView = findViewById(R.id.gridview)

        // data source
        var shape1 : Shape = Shape(R.drawable.sphereimg,"Sphere")
        var shape2 = Shape(R.drawable.cube,"Cube")
        var shape3 = Shape(R.drawable.prism,"Prism")
        var shape4 = Shape(R.drawable.cylinder,"Cylinder")
        var shape5 = Shape(R.drawable.hemisphere,"Hemisphere")
        var shape6 = Shape(R.drawable.hexagonal,"Hexagonal Pyramid")


        val gridItems = listOf<Shape>(shape1,shape2,shape3,shape4,shape5,shape6)

        // adapter
        val customAdapter = MyCustomAdapter(this, gridItems)
        gridView.adapter = customAdapter

        // handling click events
        gridView.setOnItemClickListener { _, _, position, _ ->
            val clickeditem = customAdapter.getItem(position)
            if(clickeditem?.shapename.equals("Sphere")){
                val i =Intent(this,SphereActivity::class.java)
                startActivity(i)
            }
            else if(clickeditem?.shapename.equals("Cube")){
                val i =Intent(this,CubeActivity::class.java)
                startActivity(i)
            }
            else if(clickeditem?.shapename.equals("Prism")){
                val i =Intent(this,PrismActivity::class.java)
                startActivity(i)
            }
            else if(clickeditem?.shapename.equals("Cylinder")){
                val i =Intent(this,CylinderActivity::class.java)
                startActivity(i)
            }
            else if(clickeditem?.shapename.equals("Hemisphere")){
                val i =Intent(this,HemisphereActivity::class.java)
                startActivity(i)
            }
            else if(clickeditem?.shapename.equals("Hexagonal Pyramid")){
                val i =Intent(this,HexagonalActivity::class.java)
                startActivity(i)
            }




        }



    }
}