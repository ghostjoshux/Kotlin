package `9_Estructura_Repetitiva_For`

fun main() {
    var numero1 = 0
    var numero2 = 0
    var numero3 = 0
    var esquilateros = 0
    var isosceles = 0
    var escalenos = 0
    println("Cuantos triangulos va a ingresar:")
    val cant = readln().toInt()
    for (i in 1 .. cant)
       println("Ingrese el primer lado:")
        val num1 = readln().toInt()
    print("Ingrese el segundo lado:")
    val num2 = readln().toInt()
    println("Ingrese el tercer lado:")
    val num3 = readln().toInt()
    if (num1 == num2 || num2 == num3 || num1 == num3){
        println("El triangulo es equilatero")
        esquilateros++
    }else if (num1 == num2 || num2 == num3 || num1 == num3) {
        println("EL triangulo es isosceles")
        isosceles++
    } else{
        println("El triangulo es escaleno")
        escalenos++
    }
    println("La cantidad de triangulos equilateros son: $esquilateros")
    println("La cantidad de triangulos isoscelese son: $isosceles")
    println("La cantidad de triangulos escalenos son: $escalenos")






}