package com.example.popupmenu


import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.LinearLayout
import android.widget.PopupMenu

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val popupbutton = findViewById<Button>(R.id.button)
        val background = findViewById<LinearLayout>(R.id.back)
        popupbutton.setOnClickListener {
            val Menu = PopupMenu(this@MainActivity, popupbutton)
            Menu.menuInflater.inflate(R.menu.menu, Menu.menu)
            Menu.setOnMenuItemClickListener(object:PopupMenu.OnMenuItemClickListener{

                    override fun onMenuItemClick(item: MenuItem?): Boolean {
                        when (item!!.itemId) {
                            R.id.blueColor -> background.setBackgroundColor(Color.parseColor("#0000FF"))
                            R.id.redColor -> background.setBackgroundColor(Color.parseColor("#FF0000"))
                            R.id.greenColor -> background.setBackgroundColor(Color.parseColor("#00FF00"))
                        }
                        return true
                    }
                })
                Menu.show()


        }

    }
}