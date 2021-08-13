package one.digitalinnovation.collection

fun main(){
    val values = IntArray(5)
    values[0]= 1
    values[1]= 7
    values[2]= 6
    values[3]= 3
    values[4]= 2
    for(valor in values){ println(valor) }
    println("........")
    // Outra forma de imprimir os números it representa os values presentes

    values.forEach {
        println(it) }
}
