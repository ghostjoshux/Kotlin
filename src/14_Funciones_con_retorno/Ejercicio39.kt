package `14_Funciones_con_retorno`

fun largo(nombre: String): Int {
    return nombre.length
}
fun main() {
    println("Ingrese un nombre:")
    val nombre1 = readln()
    println("Ingrese otro nombre:")
    val nombre2 = readln()
    if (largo(nombre1) == largo(nombre2))
        println("Los nombres $nombre1 y $nombre2 tienen la misma cantidad de caracteres")
    else
        if (largo(nombre1) > largo(nombre2))
            println("$nombre1 es mas largo")
    else
        println("$nombre2 es mas largo")
}