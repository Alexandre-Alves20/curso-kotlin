package AvaliacaoPOO

class Lanche: Prato(), MetodosMain {
    var duasCarnes = false


    override fun calcPreco() {
        when(duasCarnes){
            true -> precoPrato += precoAdicional
            else -> precoPrato
        }
    }
}