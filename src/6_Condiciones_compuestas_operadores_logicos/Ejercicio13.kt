package `6_Condiciones_compuestas_operadores_logicos`

fun main() {
    print("Ingrese dia:")
    val dia: Int = readln().toInt()
    print("Ingrese mes:")
    val mes: Int = readln().toInt()
    print("Ingrese año:")
    val año: Int = readln().toInt()
    if (mes == 1 || mes == 2 || mes == 3 )
        println("Corresponde al primer trimestre")
}