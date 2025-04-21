package `6_Condiciones_compuestas_operadores_logicos`

fun main() {
    print("Ingrese un valor:")
    val val1: Int = readln().toInt()
    print("Ingrese otro valor:")
    val val2: Int = readln().toInt()
    print("Ingrese otro valor:")
    val val3: Int = readln().toInt()
    val mayor = if ( val1 > val2 && val1 > val3) val1 else if (val2 > val3) val2 else val3
    val menor = if ( val1 < val2 && val1 < val3) val1 else if (val2 < val3) val2 else val3
print("El mayor es: $mayor")
    print("El menor es $menor")
}