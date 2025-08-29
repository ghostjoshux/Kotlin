package `27_POO_Data_class`

data class Jugadores(val nombre: String){
    var puntos: Int = 0
}

fun main() {
    val jugadores1 = Jugadores("Pedro")
    val jugadores2 = Jugadores("Pedro")

    jugadores1.puntos = 10
    jugadores2.puntos = 20
    if (jugadores1 == jugadores2)
        println("Tiene en mismo nombre los jugadores")
    else
        println("No tienen el mismo nombre los jugadores")
}