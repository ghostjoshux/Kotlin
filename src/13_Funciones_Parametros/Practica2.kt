package `13_Funciones_Parametros`

fun ordenarMayorMenor(num1: Int, num2: Int, num3: Int) {
    val menor: Int
    val medio: Int
    val mayor: Int

    when {
        num1 <= num2 && num1 <= num3 -> {
            menor = num1
            if (num2 <= num3) {
                medio = num2
                mayor = num3
            } else {
                medio = num3
                mayor = num2
            }
        }
        num2 <= num1 && num2 <= num3 -> {
            menor = num2
            if (num1 <= num3) {
                medio = num1
                mayor = num3
            } else {
                medio = num3
                mayor = num1
            }
        }
        else -> {
            menor = num3
            if (num1 <= num2) {
                medio = num1
                mayor = num2
            } else {
                medio = num2
                mayor = num1
            }
        }
    }

    println("Números ordenados de menor a mayor: $menor, $medio, $mayor")
}

fun main() {
    print("Ingrese el primer número: ")
    val num1 = readln().toInt()

    print("Ingrese el segundo número: ")
    val num2 = readln().toInt()

    print("Ingrese el tercer número: ")
    val num3 = readln().toInt()

    ordenarMayorMenor(num1 , num2 , num3)
}