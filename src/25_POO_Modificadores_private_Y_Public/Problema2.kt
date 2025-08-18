package `25_POO_Modificadores_private_Y_Public`

class SensorTemperatura{
    private var temperatura:Double = 0.0

    fun configurarTemperatura(){
        println("¿Cual es la temperatura actual?")
         temperatura = readln().toDouble()
        validarRango(temperatura)
    }
    fun aumentar(){
        println("¿Cuanto quieres sumarle a la temperatura?")
        val Delta: Double = readln().toDouble()
        validarRango(Delta)
        temperatura = Delta + temperatura
    }

    fun disminuir(){
        println("¿Cuanto quieres restarle a la temperatura?")
        val Delta: Double = readln().toDouble()
        validarRango(Delta)
        temperatura = temperatura - Delta
    }
    fun mostrar(){
        println("La temperatura es de $temperatura")
    }
    private fun validarRango(valor: Double): Boolean{
        if (temperatura >= -50 && temperatura <= 150)
            return true
        else {
            println("ERROR")
            return false
        }
    }
}

fun main() {
    val temp1 = SensorTemperatura()
    temp1.configurarTemperatura()
    temp1.aumentar()
    temp1.disminuir()
    temp1.mostrar()
}