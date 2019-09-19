package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

/**
 * Displays the main screen.
 */
class MainActivity : AppCompatActivity(), MainContract.MvpView{

    private var mPresenter:MainPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mPresenter = MainPresenter(this)
        val rollButton: Button = findViewById(R.id.roll_button)

    }
}
