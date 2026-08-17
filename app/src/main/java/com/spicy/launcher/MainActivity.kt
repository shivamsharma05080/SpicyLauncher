package com.spicy.launcher

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(40, 40, 40, 40)
        layout.setBackgroundColor(Color.rgb(15, 15, 20))

        val title = TextView(this)
        title.text = "🔥 SPICY LAUNCHER"
        title.textSize = 30f
        title.setTextColor(Color.WHITE)
        title.gravity = Gravity.CENTER

        val play = Button(this)
        play.text = "PLAY MINECRAFT"

        layout.addView(title)
        layout.addView(play)

        setContentView(layout)
    }
}
