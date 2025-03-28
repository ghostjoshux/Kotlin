package `3_Estructura_incondicional_if`

/*
Se ingresan tres notas de un alumno. si el promedio es mayor o giual a siete mostrar un mensaje "Promocionado"
 */
fun main() {
    println("Ingresa una nota:")
    val n1: Int = readln().toInt()
    println("Ingresa otra nota:")
    val n2: Int = readln().toInt()
    println("Ingresa otra nota:")
    val n3: Int = readln().toInt()
    val suma: Int = n1 + n2 + n3
    val promedio: Int = suma / 3
     if (promedio >= 7)
         println("promocionado")


}