fun main() {

//Média das idades (maiores de idade)

    val idades = listOf(15, 22, 18, 30, 12, 45)
    val maioresDeIdade = idades.filter { it >= 18 }
    val media = if (maioresDeIdade.isNotEmpty()) maioresDeIdade.average() else 0.0
    println("A média das idades dos maiores é: $media")
}