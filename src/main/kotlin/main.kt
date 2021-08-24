fun main (){
    val minhaFuncao : () -> Unit = ::teste
    minhaFuncao()

    val minhaFuncaoClasse : () -> Unit  = Teste()
    println(minhaFuncaoClasse())
}

fun teste(){
    println("executa teste")
}

class Teste : () -> Unit {

    override fun invoke() {
        println("executa invoke do teste")
    }

}