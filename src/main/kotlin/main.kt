fun main() {

    val endereco = Endereco(
        logradouro = "Rua Vergueiro",
        numero = 3184
    )

    val enderecoEmMaiusculo: String = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()

    println(enderecoEmMaiusculo)

   Endereco(
        logradouro = "Rua Vergueiro",
        numero = 3184
    ).let{
        endereco -> "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
    }.let(::println)


}


class Endereco(
    var logradouro: String,
    var numero: Int)