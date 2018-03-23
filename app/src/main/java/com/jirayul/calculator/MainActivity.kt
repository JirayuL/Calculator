package com.jirayul.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
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

    fun onResetButtonClicked(view:View){
        present.onClearClicked()
    }

    fun onButtonClicked(view:View){
        val b: Button = view as Button
        present.onDigitClicked(b.text.toString().toDouble())
    }

    fun onOperationButtonClicked(view: View){
        val b: Button = view as Button
        present.onOperationClicked(b.text.toString())
    }

    fun onEqualButtonClicked(view: View){
        present.onEqualClicked(display.text.toString().toDouble())
    }
}
