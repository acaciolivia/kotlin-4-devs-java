package com.br.livia.ifElse

fun main() {
    /*
        No Kotlin if é uma expressão e não uma instrução.

        Statement = Instruções de programa que não retornam nenhum valor;
        não pode estar do lado direito de um sinal de igual,

        Expression = Instruções de programa que retornam valores;
        pode estar no lado direito de um sinal de igual.

      Portanto o resultado de uma expressão em Kotlin pode ser atribuído a uma variável
      assim uma operação ternária seria redundante e não existem em Kotlin.
    */

    val myInt = 199
    val aInt : Int = 7

    //IN JAVA = val lowest = (myInt < aInt) ? myInt : aInt

    //Quando o o if é usado como expressão é necessário ter o else, cumprindo assim o papel do operador ternário
    val lowest = if(myInt < aInt) myInt else aInt

    val temp = 25

    val isAirConditionerOn = if(temp >= 26) {
        println("It is warm")
        true
    } else {
        println("It is not so warm")
        false
    }
    println("Is the air conditioner on: $isAirConditionerOn")

}