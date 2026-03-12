class execicio9

//Herança: Funcionário e Gerente

fun main() {
    val kotlin = "Funcionário e Gerente"
    println(kotlin)

    open class Funcionario(val nome: String, open val salario: Double) {
        open fun retornarSalario(): Double = salario
    }
    class Gerente(nome: String, salario: Double) : Funcionario(nome, salario) {
        // Sobrescreve a função aplicando 20% de aumento (comissão)
        override fun retornarSalario(): Double {
            return super.retornarSalario() * 1.20
        }
    }
// Teste:
    val g1 = Gerente("Carlos", 8500.00)
    println("Salário do Gerente com comissão: ${g1.retornarSalario()}")
}
