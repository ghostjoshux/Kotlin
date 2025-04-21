package `6_Condiciones_compuestas_operadores_logicos`
import kotlin.math.pow
fun main() {
    print("Ingrese un valor:")
    val val1: Int = readln().toInt()
    print("Ingrese otro valor:")
    val val2: Int = readln().toInt()
    print("Ingrese otro valor:")
    val val3: Int = readln().toInt()
    val cubo: Int = val1 * val2 * val3
    if (val1 == val2 && val1 == val2 && val2 == val3)
print("El valor al cubo es $cubo")
    else
        print("No funciona")
}