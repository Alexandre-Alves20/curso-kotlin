package AvaliacaoPOO

class Pedido: MetodosMain {
    var nomeCliente = ""
    val taxaServico = 0.1
    var listaPratos: MutableList<Prato> = mutableListOf()

    override fun addPrato(prato: Prato) {
        listaPratos.add(prato)
    }

    override fun listaPratos() {
        for (prato in listaPratos){
            println(prato.nomePrato + " - R$" + prato.precoPrato)
        }
    }

    override fun calcTotal(): Double {
        var valor = 0.0
        for (prato in listaPratos){
            valor += prato.precoPrato
        }
        return valor
    }

    override fun notaFiscal() {
        println("Cliente: $nomeCliente")
        println(listaPratos())
        println("Taxa de Serviço é de " + (calcTotal() * taxaServico))
        println("Valor total da conta é de R$ " + (calcTotal() + (calcTotal() * taxaServico)))
    }
}