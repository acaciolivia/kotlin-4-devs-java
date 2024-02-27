package com.br.livia.WhileAndFor

fun main(){
    var x = 0

    while (x < 10) {
        println("x = $x")

        x += 3
    }

    do {
        println("X = $x")
        x -= 3
    } while (x > 0)

    for (item in 1..10) {
        /*
        A variável item é internamente um val, ou seja imutável e não
        é possível incrementa-la
         */
        println("$item, ")
    }

    for (ch in "Lívia") {
        println(ch)
    }
}