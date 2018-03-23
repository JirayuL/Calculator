package com.jirayul.calculator.presenter

/**
 * Created by Gear on 23/3/2018 AD.
 */
class CalculatorPresenter(val view: CalculatorView) {
    fun start(){
        view.setDisplayValue("0")
    }
    fun onDigitClicked(digit: Int){
        view.setDisplayValue(digit.toString())
    }
    fun onClearClicked(){
        view.setDisplayValue("0")
    }
}