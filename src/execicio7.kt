class execicio7
fun main()

//Produto mais caro em um Array

{
    val kotlin = "produto mais caro em array"
    println(kotlin)

    data class Produto(val nome: String, val preco: Double)
    val produtos = listOf(
        Produto("Teclado", 125.0),
        Produto("Mouse", 85.0),
        Produto("Monitor", 945.0)
    )
    val maisCaro = produtos.maxByOrNull { it.preco }
    println("O produto mais caro é: ${maisCaro?.nome} custando R$${maisCaro?.preco}")
}
