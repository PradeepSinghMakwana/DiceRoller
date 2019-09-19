package com.example.diceroller

import android.view.View

/**
 * Responsible for handling the actions from the view and updating the UI as required.
 */
class MainPresenter : MainContract.Presenter {

    private var mView: MainContract.MvpView? = null
    private var counter: Int = 1

    constructor(view: MainContract.MvpView) {
        mView = view
    }

    override fun handleRollButton(v: View) {
        val randomInt = java.util.Random().nextInt(6) + 1
        counter = counter % 6 + 1
        mView?.showText(randomInt.toString())
        mView?.showImage(randomInt)
    }
}