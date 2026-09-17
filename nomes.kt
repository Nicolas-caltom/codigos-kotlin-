fun main() {
    val nomes = listOf("Ana", "Carlos", "Beatriz", "João")
    val sobrenomes = listOf("Silva", "Santos", "Oliveira", "Souza")

    // Combina as listas índice por índice e gera os nomes completos
    val nomesCompletos = nomes.zip(sobrenomes) { nome, sobrenome ->
        "$nome $sobrenome"
    }

    // Exibe o resultado
    nomesCompletos.forEach { println(it) }
}