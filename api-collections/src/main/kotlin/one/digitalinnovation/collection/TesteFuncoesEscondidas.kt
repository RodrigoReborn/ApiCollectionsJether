package one.digitalinnovation.collection

fun main() {
    val salarios= arrayOf(
    "2000".toBigDecimal(),
    "1500".toBigDecimal(),
    "4000".toBigDecimal()
    )
       println("Soma dos Salarios:")
    println( salarios.somatoria() )

    println("Media dos Salarios:")
    println( salarios.media())
}