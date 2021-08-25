fun main() {
    val minhaFuncaoLambda = {
        println("Executa como lambda")
    }

    println(minhaFuncaoLambda)

    val minhaFuncaoAnonima: () -> Unit = fun() {
        println("Executa funcao anonima")
    }

    println(minhaFuncaoAnonima)

    testaTipoReferencia()
    testaTipoReferenciaClasse()

    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if (salario > 1000.0) {
            return@lambda salario + 50
        }
        return@lambda salario + 100.0
    }

    println(calculaBonificacao(1000.0))

    val calculaBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if (salario > 1000.0) {
            return salario + 50
        }
        return salario + 100.0
    }

    println(calculaBonificacaoAnonima(1000.0))

}

fun testaTipoReferenciaClasse() {
    val minhaFuncaoClasse: (Int, Int) -> Int = Teste()
    println(minhaFuncaoClasse(20, 5))
}

fun testaTipoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(5, 10))
}

fun soma(a: Int, b: Int): Int = a + b

class Teste : (Int, Int) -> Int {
    override fun invoke(p1: Int, p2: Int): Int = p1 + p2

}