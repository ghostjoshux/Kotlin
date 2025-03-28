package `2_Entrada_de_Datos`

/*
Realizar un programa que lea por teclado cuatro valores numericos
 enteros e informar su suma y promedio
 */
fun main() {
    println("Ingrese un numero")
    val v1: Int = readln().toInt()
    println("Ingrese un numero")
    val v2: Int = readln().toInt()
    println("Ingrese un numero")
    val v3: Int = readln().toInt()
    println("Ingrese un numero")
    val v4: Int = readln().toInt()
    val suma: Int = v1 + v2 + v3 + v4
    val promedio: Int = suma / 4
    println("La suma de los cuatro numero es $suma")
    println("El promedio es $promedio")
}