package orientacaoObjetos.objetos

fun main() {
    val location1 = object {
        var xCoordinate = 200
        var yCoordinate = 400
    }

    val location2 = object {
        var xCoordinate = 300
        var yCoordinate = 600

        fun printIt(){
            println("Coordinates = ($xCoordinate, $yCoordinate)")
        }
    }


    println("Coordinates = (${location1.xCoordinate}, ${location1.yCoordinate})")
    location2.printIt()

    location2.xCoordinate = 3000
    location2.yCoordinate = 6000

    location2.printIt()
    val temperature = MySingleton.getLastTemperature()
    println("Last temperature measured = $temperature degress!")
}

object MySingleton {
    var temperatures = arrayOf(18,22,26)
    fun getLastTemperature() = temperatures.last()
}