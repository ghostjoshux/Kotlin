package `19_Arreglos`

fun main() {
    // Definir los arreglos
    val arreglo1 = IntArray(4)
    val arreglo2 = IntArray(4)
    val Suma = IntArray(4)

    // Primer arreglo
    println("Ingrese los elementos del primer arreglo:")
    for (i in arreglo1.indices) {
        print("Elemento::")
        arreglo1[i] = readln().toInt()
    }
    // Segundo arreglo
    println("Ingrese los elementos del segundo arreglo:")
    for (i in arreglo2.indices) {
        print("Elemento")
        arreglo2[i] = readln().toInt()
    }
    // Suma
    for (i in arreglo1.indices) {
        Suma[i] = arreglo1[i] + arreglo2[i]
    }

    // Imprimir resultados
    println("Arreglo 1: ${arreglo1}")
    println("Arreglo 2: ${arreglo2}")
    println("Arreglo suma: ${Suma}")
}