package `19_Arreglos`

/*
Cargar un arreglo de 10 elementos de tipo entero.Imprimir
luego el primer y ultimo elemento.
 */
fun main() {
    val arreglo = IntArray(10)
    for (i in arreglo.indices) {
        print("Ingres elemento:")
        arreglo[i] = readln().toInt()
    }
    println("Primera componente del arreglo ${arreglo[0]}")
    println("Ultima componente del arreglo ${arreglo[arreglo.lastIndex]}")
}
