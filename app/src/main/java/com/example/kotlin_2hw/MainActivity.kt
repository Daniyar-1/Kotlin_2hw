package com.example.kotlin_2hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_2hw.extensions.loadImage
import com.example.kotlin_2hw.extensions.showMessage
import kotlinx.android.synthetic.main.activity_main.*

private var array = ArrayList<String>()


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        array.add("https://static01.nyt.com/images/2015/12/27/travel/27WARSAW1/27WARSAW1-facebookJumbo.jpg")
        array.add("http://i.huffpost.com/gen/3938626/images/o-ROMANTIC-OTTAWA-RESTAURANTS-facebook.jpg")
        array.add("https://i.ytimg.com/vi/lUV4QgpJxrc/maxresdefault.jpg")
        array.add("https://rivierabarcrawltours.com/wp-content/uploads/2019/07/paris-night-walking-tours.jpg")
        array.add("http://static.thousandwonders.net/Bishkek.640.32145.jpg")

        btn_random.setOnClickListener {
            if (!array.isNullOrEmpty()) {
                val url = array.random()
                image.loadImage(this, url)
            }
        }
        btn_submit.setOnClickListener {
            if (et_message.text.isNullOrEmpty()) {
                et_message.error = "Enter something"
            } else {
                showMessage(et_message.text.toString())
            }
        }
    }
}