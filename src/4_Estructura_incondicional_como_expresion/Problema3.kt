package `4_Estructura_incondicional_como_expresion`

fun main() {
    print("Ingrese el primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese segundo valor:")
    val valor2 = readln().toInt()
    print("Ingrese el tercer valor:")
    val valor3 = readln().toInt()
    val lados: Int = valor1 + valor2
    if (lados > valor3)
        if (valor1 == valor2 && valor2 == valor3 && valor1 == valor3)
            print("Es equilatero")
        else if (valor1 == valor2 || valor2 == valor3 || valor1 == valor3)
            print("Es isosceles")
        else
            print("El triangulo es escaleno")
}

