package one.digitalinnovation.collection

fun main() {
    val salarios= doubleArrayOf(1000.0, 2250.0, 4000.0,10000.0, 3500.0, 7000.0, 2000.0, 4750.0, 2300.0)
    println("Salarios:")
    salarios.sort()
    salarios.forEach { println(it) }

    println("Maior Salario: ${salarios.maxOrNull()}")
    println("Menor Salario: ${salarios.minOrNull()}")
    println("Media Salarial: ${salarios.average()}")

    val maiorQue2500= salarios.filter{it > 2500.0}
    println("Salarios maiores que R$2500,00:")
    maiorQue2500.forEach { println(it) }

    println("Salarios entre R$2000,00-5000,00:")
    println(salarios.count { it in 2000.00..5000.0 }) //verifica oqe tem entre 2000-5000
    println("Salario Atendente:")
    println(salarios.find { it == 2250.0 }) // busca se tem esse valor no caso 2250 e o retorna senão retorna Null
    println("O servente recebe um salario de R$1000,00 ?")
    println(salarios.any { it == 1000.0 }) // verifica se tem o valor 1000 e retorna true ou false

}