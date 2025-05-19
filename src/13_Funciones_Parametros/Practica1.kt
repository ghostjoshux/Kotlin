package `13_Funciones_Parametros`

fun VerificarClaves(clave1: String, clave2: String) {
    if (clave1 == clave2)
        println("La claves coinciden")
    else
        println("Las claves no coninciden")
}

fun main() {
    println("Digite una clave:")
    val clave1 = readln()
    println("Confirme la clave:")
    val clave2 = readln()
    VerificarClaves(clave1,clave2)

}