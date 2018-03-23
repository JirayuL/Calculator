package com.jirayul.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.jirayul.calculator.presenter.CalculatorPresenter
import com.jirayul.calculator.presenter.CalculatorView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), CalculatorView {

    override fun setDisplayValue(value: String) {
        display.text = value
    }

    lateinit var present:CalculatorPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        present = CalculatorPresenter(this)
    }

    fun onResetClicked(){
        present.onClearClicked()
    }
}
