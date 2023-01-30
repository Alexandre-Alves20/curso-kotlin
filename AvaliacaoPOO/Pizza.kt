package AvaliacaoPOO

class Pizza: Prato(), MetodosMain{
    var borda = false


    override fun calcPreco() {
        when (borda) {
            true -> precoPrato += precoAdicional
            else -> precoPrato
        }
    }
}
