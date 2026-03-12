class execicio8

//Classe Conta Bancária (Encapsulamento)

class ContaBancaria(private val nomeTitular: String, private var saldo: Double)
{
    fun depositar(valor: Double) {
        if (valor > 0) {
            saldo += valor
        } else {
            println("Valor de depósito inválido.")
        }
    }
    fun sacar(valor: Double) {
        if (valor <= saldo) {
            saldo -= valor
        } else {
            println("Saldo insuficiente para saque.")
        }
    }
    fun consultarSaldo(): Double = saldo
}
fun main() {
    val kotlin = "Funcionário e Gerente encapsulamento"
    println(kotlin)
    val conta = ContaBancaria("João", 1500.0)
    conta.depositar(800.0)
    println("Saldo após depósito: ${conta.consultarSaldo()}")
    conta.sacar(900.0)
    println("Saldo após saque: ${conta.consultarSaldo()}")
}
