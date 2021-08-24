fun main (){
    val minhaFuncaoLambda  = {
        println("Executa como lambda")
    }

    println(minhaFuncaoLambda)

    val minhaFuncaoAnonima :() -> Unit = fun (){
        println("Executa funcao anonima")
    }

    println(minhaFuncaoAnonima)

    testaTipoReferencia()
    testaTipoReferenciaClasse()


}

fun testaTipoReferenciaClasse() {
    val minhaFuncaoClasse: (Int, Int) -> Int = Teste()
    println(minhaFuncaoClasse(20,5))
}

fun testaTipoReferencia()  {
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(5, 10))
}

fun soma(a: Int, b: Int): Int = a + b

class Teste : (Int, Int) -> Int {
    override fun invoke(p1: Int, p2: Int): Int  = p1 + p2

}