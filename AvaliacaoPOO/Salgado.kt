package AvaliacaoPOO

class Salgado: Prato(), MetodosMain {
    var catupiry = false


    override fun calcPreco() {
        when(catupiry){
            true -> precoPrato += precoAdicional
            else -> precoPrato
        }
    }
}