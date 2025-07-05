import com.bargystvelp.aimath.NeuralCalculator

fun main() {
    val house = 1f
    val rock = 0f
    val attr = 1f

    val result = NeuralCalculator.go(house, rock, attr)
    if (result == 1f) {
        println("Ты мне нравишься")
    } else {
        println("Созвонимся")
    }
}