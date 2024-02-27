package com.br.livia.forWithArrays

fun main () {
    var index = 0
    for (item in 10.rangeTo(20).step(2)) {
        println("${++index} ) $item, ")
    }

    println()

    for ((indx, item) in 10.rangeTo(20).step(2).withIndex()) {
        println("${indx + 1} ) $item, ")
    }
}