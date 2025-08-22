package `24_POO_Colaboracion_clases`

class Cliente(var nombre: String, var monto: Float){

    fun depositar(monto: Float){
            this.monto += monto
    }

    fun extraer(monto: Float){
        this.monto -= monto
    }
    fun imprimir(){
        println("$nombre tiene depositado la suma de $monto")
    }
}
class BAnco {
    val cliente1: Cliente = Cliente("Juan",0f)
    val cliente2: Cliente = Cliente("Maria",0f)
    val cliente3: Cliente = Cliente("Dilan",0f)

    fun operar(){
        cliente1.depositar(100f)
        cliente2.depositar(150f)
        cliente3.depositar(200f)
        cliente3.extraer(150f)
    }
    fun depositosTotales(){
        val total = cliente1.monto + cliente2.monto + cliente3.monto
        println("El total de dinero del banco  es $total")
        cliente1.imprimir()
        cliente2.imprimir()
        cliente3.imprimir()
    }
}

fun main() {
    val banco1 = BAnco()
    banco1.operar()
    banco1.depositosTotales()
}