package com.br.livia.whenexpression

fun main() {
    /*
        Em Kotlin a when expression substituí a instrução switch case classica,
        e tem duas formas: com argumento e sem argumento.

        Podemos comparar o argumento com os resultados de uma expressão
     */

    val pizzasOrdered = 7

    //com argumento
    when(pizzasOrdered) {
        0 -> println("Not hungry")
        1 -> println("Hungry")
        2 -> println("Very hungry")
        else -> println("Are you sure?")
    }

    //juntando casos
    when(pizzasOrdered) {
        0 -> println("Not hungry")
        1,2 -> println("Hungry")
        3 -> println("Very hungry")
        else -> println("Are you sure?")
    }

    //Verificando o resultado de uma expressão
    when(pizzasOrdered) {
       Math.abs(pizzasOrdered) -> println("Ordered 0 or more pizzas")
        else -> println("Ordered less than 0")
    }

    //Usando range - intervalo
    when(pizzasOrdered) {
        0 -> println("We need orders")
        in 1..4 -> println("Got some orders")
        in 5..9 -> println("Business is up")
        else -> println("Are you sure?")
    }

    //sem argumento e verificando condições booleans
    when {
        pizzasOrdered <= 0 -> println("None orders")
        pizzasOrdered %2 == 1 -> println("Odd number ordered")
        pizzasOrdered %2 == 0 -> println("Even number ordered")
    }
}