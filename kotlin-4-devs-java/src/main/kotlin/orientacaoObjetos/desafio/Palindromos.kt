package orientacaoObjetos.desafio

fun main() {
    verificaPalindromos("ana")
    verificaPalindromos("renner")
    verificaPalindromos("cachorro")
}

fun verificaPalindromos(srt: String) {

    var x = srt.replace("\\s+".toRegex(), "").toLowerCase()

    val palavraInvertida = srt.reversed()

    if (x == palavraInvertida) {
        println("É um palindromo")
    } else println("Não é um palindromo")

}