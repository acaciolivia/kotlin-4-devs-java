package com.br.livia.functions

fun main() {
println("10 + 20 = ${myMathFunction(10, 20)}")
println("15 +25 = ${myExpressionBodyFunction(15, 25)}")
}


fun myMathFunction(number1: Int, number2: Int) : Int {
    return number1 + number2;
}

fun myExpressionBodyFunction(number1: Int, number2: Int) : Int = number1 + number2