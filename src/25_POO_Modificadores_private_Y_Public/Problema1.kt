package `25_POO_Modificadores_private_Y_Public`

class CuentaBancaria{
    private var saldo: Int = 0

    public fun Depositar(monto: Int = 0){
        println("Cuanto deseas depositar:")
        val monto = readln().toInt()
        montoValido(monto)
    }

    public fun retirar( monto: Int = 0){
        println("Cuanto deseas retirar:")
        val monto = readln().toInt()
        puedeRetirar(monto)
println("*******************************************************************")
        }


    public fun ConsultarSaldo(){
        println("El saldo es de $saldo")
    }


    private fun montoValido(monto: Int) {
        if (monto > 0) {
            true
            println("Si se puede depositar")
            saldo = monto +saldo
            println("Depositado")

        } else{
            false
            println("Error")
        }
    }

    private fun puedeRetirar(monto: Int) {
        if (monto > 0 && monto < saldo) {
            true
            println("Puede retirar")
            saldo = saldo - monto
        } else{
            false
        println("No se puede retirar")}
    }

    }

fun main() {
    val Banco = CuentaBancaria()
    Banco.Depositar()
    Banco.retirar()
    Banco.ConsultarSaldo()
}


