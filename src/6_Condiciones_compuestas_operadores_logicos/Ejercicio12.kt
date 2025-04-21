package `6_Condiciones_compuestas_operadores_logicos`

fun main() {
    print("Ingrese primer valor:")
    val num1: Int = readln().toInt()
    print("Ingrese segundo valor:")
    val num2: Int = readln().toInt()
    print("Ingrese tercer valor:")
    val num3: Int = readln().toInt()
    if (num1 > num2 && num1 > num3)
        print("El numero mayor es $num1")
    else
        if (num2 > num3)
            print("El numero mayor es $num2")
    else
        print("El numero mayor es $num3")
}