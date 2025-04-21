package `6_Condiciones_compuestas_operadores_logicos`

fun main() {
    print("Ingrese un dia:")
    val dia: Int = readln().toInt()
        print("Ingrese un mes:")
        val mes: Int = readln().toInt()
    if (dia == 24 && mes == 12)
        print("Es navidad")
    else
        print("Es un dia normal")
}