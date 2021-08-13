package one.digitalinnovation.collection

data class funcionario (val nome: String, val salario: Double, val tipoContratacao: String)
{
    override fun toString(): String=
        """
        Nome: $nome
        Salario: R$$salario 
        
        """.trimIndent()
}
