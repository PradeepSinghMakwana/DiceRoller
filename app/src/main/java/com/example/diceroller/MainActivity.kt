package com.example.diceroller

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.diceroller.databinding.ActivityMainBinding


/**
 * Displays the main screen.
 */
class MainActivity : AppCompatActivity(), MainContract.MvpView{

    private var mPresenter:MainPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        mPresenter = MainPresenter(this)
        binding.presenter = mPresenter

        // val rollButton: Button = findViewById(R.id.roll_button)

    }

    override fun showText(s: String) {
        val textView: TextView = findViewById(R.id.textView)
        textView.text = s
    }

    override fun showImage(imgNo: Int) {
        val imageView: ImageView = findViewById(R.id.dice_image)
        val drawableResource = when (imgNo) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        imageView.setImageResource(drawableResource)
    }
}
