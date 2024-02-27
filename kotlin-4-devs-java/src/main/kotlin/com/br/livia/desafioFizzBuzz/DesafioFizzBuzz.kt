package com.br.livia.desafioFizzBuzz

fun main() {
    //se for multiplo de 3 imprimir fizz, multiplo de 5 imprimir buzz e multiplo de 3 e 5 fiz Buzz
    fun FizzBuzz(end: Int ) {
        for(k in 1..end) {
            if (k % 3 == 0 && k % 5 == 0) {
                println("Fizz")
            } else if (k % 5 == 0) {
                println("Buzz")
            } else if(k % 3 == 0) {
                println("Fizz Buzz")
            } else {
                println(k)
            }
        }
    }

    FizzBuzz(50)
}

fun fizzBuzz(n: Int) : List<String> {
    val list = mutableListOf<String>()

    for (it in 1..n) {
        val item = when {
            it % 3 == 0 && it % 5 == 0 -> "FizzBuzz"
            it % 3 == 0 -> "Fizz"
            it % 5 == 0 -> "Buzz"
            else -> it.toString()
        }
        list.add(item)
    }

    return list
}