package `5_Estructuras_condicionales_anidadas`

fun main() {
    println("cantidad de preguntas:")
    val preguntas = readln().toInt()
    println("Cantidad de respuestas correctas:")
    val respuestas = readln().toDouble()
    val porcentaje = respuestas / preguntas * 100
    if (porcentaje >= 90)
        println("Nivel maximo")
    else if (porcentaje >= 75)
            print("nivel medio")
        else if (porcentaje <= 50)
                print("nivel regular")
    else
        println("fuera de nivel")
}
