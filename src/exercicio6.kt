class exercicio6
fun main()

//Objeto "Pessoa" com método
{
    val kotlin = "Objeto Pessoa com método"
    println(kotlin)

    class Pessoa(val nome: String, val idade: Int, val cidade: String) {
        fun exibirDados() {
            println("$nome tem $idade anos e mora em $cidade.")
        }
    }
    val pessoa1 = Pessoa("Maria", 25, "São Paulo")
    pessoa1.exibirDados()
}