package com.br.livia.tiposvariaveis

fun main(){
    //val utilizado para variáveis que são imutáveis durante a vida útil da aplicação, alguns frameworks java não aceitam val
    //var utilizado para variáveis mutáveis

    //Se você não passar um valor a variável, o Kotlin não consegue fazer a inferência de tipos

    val myPhrse = "I'm a String"
    val myPi = 3.14
    val myAnswer = 3

    val aString: String
    val aDouble: Double
    val aInt: Int

    val myDouble = 1.999
    val myFloat = 1.9f // necessário f minúsculo para indicar float, do contrário ele converte para double
    val myLong = 928394827492847L //necessário L maiúsculo para indicar long, do contrário ele converte para int
    val myInt = 199
    val myShort: Short = 12
    val myByte:Byte = -127

    val aLongNumber = 123_456_789
    val theSameNumber = 123456789

    val anInt: Int = 7
    val anLong: Long = anInt.toLong()  //O cast não é automático


}