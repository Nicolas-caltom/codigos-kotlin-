import kotlin.random.Random

fun main() {
    val numeroSorteado = Random.nextInt(1, 7) // O limite superior (7) é exclusivo
    println("Número sorteado: $numeroSorteado")
}