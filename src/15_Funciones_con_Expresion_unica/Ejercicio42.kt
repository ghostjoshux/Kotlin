package `15_Funciones_con_Expresion_unica`

fun convertirCastelano(valor: Int) = when (valor){
    1 -> "Uno"
    2 -> "Dos"
    3 -> "Tres"
    4 -> "Cuatro"
    5 -> "Cinco"
    else -> "Error"

}

fun main() {
    for (i in 1..6)
        println(convertirCastelano(i))
}