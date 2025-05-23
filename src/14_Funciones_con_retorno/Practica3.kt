package `14_Funciones_con_retorno`

fun ladosrectangulos (v1:Double, v2:Double, v3:Double, v4:Double): Double{
    val t1 = v1 * v2
    val t2 = v3 * v4
    if (t1 > t2){
        println("El triangulo con mayor superficie es el primero con $t1")
        return t1
    }else {
        println("El triangulo con mayor superficie e el segundo con $t2")
        return t2
    }
}

fun main() {
    println("Ingrese los lados del primer rectangulo:")
    println("Ingrese el primer lado:")
    val lado1 = readln().toDouble()
    println("Ingrese el segundo lado:")
    val lado2 = readln().toDouble()
    println("Ingrese los lados del segundo rectangulo:")
    println("Ingrese el primer lado:")
    val lado3 = readln().toDouble()
    println("Ingrese el segundo lado:")
    val lado4 = readln().toDouble()
    ladosrectangulos(lado1, lado2, lado3, lado4)
}