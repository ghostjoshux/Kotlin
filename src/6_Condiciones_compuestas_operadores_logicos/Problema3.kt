package `6_Condiciones_compuestas_operadores_logicos`

fun main() {
    print("Ingrese un valor:")
    val val1: Int = readln().toInt()
    print("Ingrese otro valor:")
    val val2: Int = readln().toInt()
    print("Ingrese otro valor:")
    val val3: Int = readln().toInt()
    if (val1 < 10  && val2 < 10 && val3 < 10)
        print("Todos los numeros son menores a diez ")
    else
        print("Todos los numeros son mayores a diez")
}