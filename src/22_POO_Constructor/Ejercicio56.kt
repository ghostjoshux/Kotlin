package `22_POO_Constructor`

class Persona2 (var nombre: String , var edad: Int){

    fun imprimir(){
        println("Nombre: $nombre y tiene una edad de $edad")
    }
    fun esMayorEdad(){
        if (edad >= 18)
            println("$nombre es mayor de eddad")
        else
            println("$nombre es menor de edad")
    }
}

fun main() {
    val persona1 = Persona2("Juan",6)
    persona1.imprimir()
    persona1.esMayorEdad()

}