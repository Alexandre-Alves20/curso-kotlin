package AvaliacaoPOO

fun main()  {
    val prato1 = Pizza()
    prato1.nomePrato = "Pizza"
    prato1.precoPrato = 45.0
    prato1.precoAdicional = 5.0
    prato1.borda = true

    prato1.calcPreco()

    val prato2 = Lanche()
    prato2.nomePrato = "Lanche"
    prato2.precoPrato = 20.0
    prato2.precoAdicional = 10.0
    prato2.duasCarnes = true

    prato2.calcPreco()

    val prato3 = Salgado()
    prato3.nomePrato = "Pizza"
    prato3.precoPrato = 8.0
    prato3.precoAdicional = 2.5
    prato3.catupiry = false

    val listaPedidos = Pedido()
    listaPedidos.nomeCliente = "Alexandre"
    listaPedidos.addPrato(prato1)
    listaPedidos.addPrato(prato2)
    listaPedidos.addPrato(prato3)

    println(listaPedidos.notaFiscal())
}