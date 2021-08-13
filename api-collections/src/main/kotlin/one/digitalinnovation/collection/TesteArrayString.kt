package one.digitalinnovation.collection

fun main(){
    val nomes = Array<String>(3){""}
    nomes[0]= "Maria"
    nomes[1]= "Zazá"
    nomes[2]= "José"
    for (nome in nomes){ println(nome) }

        println("------------------")
    nomes.sort()
    nomes.forEach { println(it)}

        println("------------------")
        // para não ter que dizer oque vai ter em cada posição usando o nomes[]
        val nomes2= arrayOf("Maria", "Zazá", "Pedro")
        nomes2.sort()
        nomes2.forEach { println(it) }

}
