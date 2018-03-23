package com.jirayul.calculator.presenter

/**
 * Created by Gear on 23/3/2018 AD.
 */
class CalculatorPresenter(val view: CalculatorView) {

    var first: Double = 0.0
    var result: Double = 0.0
    var op: String = ""

    fun start(){
        updateDisplay()
    }
    fun onDigitClicked(digit: Double){
        result = (result*10) + digit
        view.setDisplayValue(result.toString())
    }

    fun onClearClicked(){
        first = 0.0
        result = 0.0
        updateDisplay()
    }

    fun onOperationClicked(op: String){
        this.first = this.result
        this.result = 0.0
        this.op = op
        view.setDisplayValue("")
    }

    fun onEqualClicked(digit: Double){
        when (op) {
            "+" -> result = first + digit
            "-" -> result = first - digit
            "*" -> result = first * digit
            "/" -> result = first / digit
            else -> result = 0.0
        }
        updateDisplay()
    }

    fun updateDisplay(){
        view.setDisplayValue(result.toString())
    }
}