package orientacaoObjetos.interfaces

interface Vehicle {

    val autoMakerName : String

    fun start() {
        println("Vruuuuuuum")
    }

    fun stop() {
        println("Brake noise")
    }

    fun getKmPerLiter() : Int {
        return 17
    }

    fun getDoors(): Int
}