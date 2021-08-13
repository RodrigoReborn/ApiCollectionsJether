package one.digitalinnovation.collection

fun main(){
    val salarios = DoubleArray(3)
    salarios[0]= 1000.0
    salarios[1]= 3000.0
    salarios[2]= 500.0
    salarios.forEach { println(it) }

    println("Você recebeu um bônus de 10%")

    salarios.forEachIndexed{ index, salario -> salarios[index] = salario * 1.1 }
    salarios.forEach{ println(it) }

    println("Salário em ordem crescente")
    val salario2= doubleArrayOf(500.0, 3000.0, 1000.0)
    salario2.sort()
    salario2.forEach{ println(it) }
}