package com.example.diceroller

import android.view.View

/**
 * Defines the contract between the view [MainActivity] and the Presenter
 * [MainPresenter].
 */
interface MainContract {
    interface MvpView {
        fun showText(text: String)
        fun showImage(imgNo: Int)
    }

    interface Presenter {
        fun handleRollButton(v: View)
    }
}
