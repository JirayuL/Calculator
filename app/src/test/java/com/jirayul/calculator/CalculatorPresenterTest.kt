package com.jirayul.calculator

import com.jirayul.calculator.presenter.CalculatorPresenter
import com.jirayul.calculator.presenter.CalculatorView
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify

/**
 * Created by Gear on 23/3/2018 AD.
 */
class CalculatorPresenterTest {
    lateinit var view: CalculatorView
    lateinit var presenter: CalculatorPresenter

    @Before
    fun init(){
        view = mock(CalculatorView::class.java)
        presenter = CalculatorPresenter(view)
    }

    @Test
    fun testStart() {
        presenter.start()
        verify(view).setDisplayValue("0")
    }

}