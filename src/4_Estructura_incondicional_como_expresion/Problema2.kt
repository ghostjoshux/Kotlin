package `4_Estructura_incondicional_como_expresion`

fun main() {
    println("Ingrese su edad:")
    val edad: Int = readln().toInt()
    val respuesta = if (edad < 13) {
        println("Eres un niño")
    } else
        if (edad >= 13 && edad <= 17){
            println("Eres un adolecente")
        } else{
            println("Eres un adulto")
        }
}
