fun main (){
    val minhaFuncaoLambda  = {
        println("Executa como lambda")
    }

    println(minhaFuncaoLambda)

    val minhaFuncaoAnonima :() -> Unit = fun (){
        println("Executa funcao anonima")
    }

}

fun testaTipoReferenciaClasse() {
    val minhaFuncaoClasse: () -> Unit = Teste()
    println(minhaFuncaoClasse())
}

fun testaTipoReferencia() {
    val minhaFuncao: () -> Unit = ::teste
    minhaFuncao()
}

fun teste(){
    println("executa teste")
}

class Teste : () -> Unit {

    override fun invoke() {
        println("executa invoke do teste")
    }

}