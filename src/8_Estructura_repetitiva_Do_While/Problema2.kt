package `8_Estructura_repetitiva_Do_While`

fun main() {
    var suma = 0.0
    var cuenta = 0
    do {
        print("Ingrese numeros de cuenta(negativo para terminar):")
        cuenta = readln().toInt()
        if (cuenta >= 0) {
            print("Ingrese saldo actual de la cuenta $cuenta: ")
            val saldo = readln().toDouble()
            val E = if (saldo > 0) {
                "Acredor"
            } else if (saldo > 0) {
                "Deudor"
            } else {
                "Nulo"
            }
            println("Cuenta: $cuenta | Saldo: $saldo | Estado: $E")
            if (saldo > 0) {
                suma += saldo
            }
        }
    } while (cuenta >= 0)
    println("Suma total de saldos acreedores: $suma")
}