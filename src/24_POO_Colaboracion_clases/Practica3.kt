package `24_POO_Colaboracion_clases`

class Motor(var encendido: Boolean) {

    fun encender() {
        if(encendido == true){
            println("El carro ya esta encendido")
        }else{
        println("El motor se acaba de encender")
        this.encendido = true
        }
    }

    fun apagar() {
        this.encendido = false
    }

    fun estado() {
        if (encendido == true)
            println("Esta encendido")
        else
            println("Esta apagado")
    }
}

class carro {
    var motor1: Motor = Motor(false)

    fun conducir() {
        println("voy a encender el motor")
        motor1.encender()
        motor1.estado()
        println("voy a apagar el motor")
        motor1.apagar()
        motor1.estado()
    }

    fun estadoGeneral() {

        motor1.estado()

    }
}

fun main() {
    val carro1 = carro()
    carro1.conducir()


}