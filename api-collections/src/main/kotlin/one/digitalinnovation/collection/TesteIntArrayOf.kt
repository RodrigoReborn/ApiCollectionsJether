package one.digitalinnovation.collection

fun main(){
    val values= intArrayOf(2, 3, 4, 1, 10, 7)

    for(valor in values){ println(valor) }
    println("____________")
    // Outra forma de imprimir os números it representa os values presentes
    values.forEach {
        println(it) }

    println("____________")
    values.sort() // nomedavariável.sort= coloca os números em ordem crescente 1,2,3.....
    values.forEach {
        println(it) }
}