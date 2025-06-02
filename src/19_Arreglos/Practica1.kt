package `19_Arreglos`
fun main() {
    // Definir el arreglo de enteros
    val arreglo = IntArray(8)

    // Cargar el arreglo
    for (i in arreglo.indices) {
        print("Ingrese el elemento:")
        arreglo[i] = readln().toInt()
    }

    // Variables
    var Suma = 0
    var Mayor36 = 0
    var Mayor50 = 0

    // Analizar
    for (elemento in arreglo) {
        Suma += elemento
        if (elemento > 36) {
            Mayor36 += elemento
        }
        if (elemento > 50) {
            Mayor50++
        }
    }

    // Imprimir resultados
    println("Valor acumulado de todos los elementos: $Suma")
    println("Valor acumulado de los elementos mayores a 36: $Mayor36")
    println("Cantidad de valores mayores a 50: $Mayor50")
}