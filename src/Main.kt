//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val kotlin = "lista de preços"
    println(kotlin)

    val precos = listOf(25.50, 10.00, 5.75, 100.00)
    val total = precos.sum()
    println("O total da compra é: R$ $total")
}
