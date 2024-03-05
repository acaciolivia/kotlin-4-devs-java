package programacaofuncional

fun main() {
    val students = getStudents()

    val combos = students.map { a -> "${a.name} : ${a.age}" }
    println("Combos: $combos")
}