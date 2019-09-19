package com.example.diceroller

import android.view.View
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations

class MainPresenterTest {

    @Mock
    private var mView: MainContract.MvpView? = null

    @Mock
    private var view: View? = null

    private var mPresenter: MainContract.Presenter? = null


    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        mPresenter = MainPresenter(mView!!)
    }

    @After
    fun tearDown() {
    }

    @Test
    fun handleRollButton_showText() {
        mPresenter?.handleRollButton(view!!)
        verify(mView!!).showText("2")
    }
}