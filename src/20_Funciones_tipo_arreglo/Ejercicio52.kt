package `20_Funciones_tipo_arreglo`

fun cargar(): IntArray {
    println("Cuantos sueldos quiere cargar:")
        val cantidad = readln().toInt()
    val sueldos = IntArray(cantidad)
    for (i in sueldos.indices){
        println("Ingrese elemento:")
        sueldos[i] = readln().toInt()
    }
    return sueldos
}
fun imprimir2(sueldos: IntArray){
    println("Listado de todos los sueldos")
    for (sueldo in sueldos)
        println("sueldos")
}
fun main() {
    val sueldos = cargar()
    imprimir2(sueldos)
}