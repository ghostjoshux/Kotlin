package `10_Estructura_condicional_when`

fun main() {
    println("Ingrese primera nota:")
    val nota1 = readln().toInt()
    println("Ingrese segunda nota:")
    val nota2 = readln().toInt()
    println("Ingrese tercer nota:")
    val nota3 = readln().toInt()
    val promedio = (nota1 + nota2 + nota3) / 3
    when{
        promedio >= 7 -> print("Aprobado")
        promedio >= 4 -> print("Regular")
        else -> print("Reprobado")

    }
}