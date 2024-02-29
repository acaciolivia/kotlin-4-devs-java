package interoperabilidade.java

import interoperabilidade.Animal

fun main() {

    val cat = Animal("Garfield", "cat", 10)
    println(cat.show())

    val dog = Animal("Totó", "dog", 8)
    println(dog.show())
}