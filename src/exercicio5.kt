class exercicio5
fun main()

//Cálculo de Fatorial

{
    val kotlin = "Cálculo de Fatorial"
    println(kotlin)

    fun calcularFatorial(n: Int): Long {
        var resultado = 1L
        for (i in 1..n) {
            resultado *= i
        }
        return resultado
    }
// Exemplo de uso:
    println("Fatorial de 5 é: ${calcularFatorial(5)}")
}