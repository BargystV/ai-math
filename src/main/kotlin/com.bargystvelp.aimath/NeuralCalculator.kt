package com.bargystvelp.aimath

object NeuralCalculator {

    private fun act(x: Float): Float {
        return if (x < 0.5f) 0f else 1f
    }

    fun go(house: Float, rock: Float, attr: Float): Float {
        val x = floatArrayOf(house, rock, attr)

        val w11 = floatArrayOf(0.3f, 0.3f, 0f)
        val w12 = floatArrayOf(0.4f, -0.5f, 1f)
        val weight1 = arrayOf(w11, w12) // 2x3

        val weight2 = floatArrayOf(-1f, 1f) // 1x2

        // Вычисляем сумму на скрытом слое
        val sumHidden = FloatArray(2) { i ->
            var sum = 0f
            for (j in x.indices) {
                sum += weight1[i][j] * x[j]
            }
            sum
        }

        println("Значения сумм на нейронах скрытого слоя: ${sumHidden.joinToString()}")

        val outHidden = sumHidden.map { act(it) }.toFloatArray()
        println("Значения на выходах нейронов скрытого слоя: ${outHidden.joinToString()}")

        var sumEnd = 0f
        for (i in weight2.indices) {
            sumEnd += weight2[i] * outHidden[i]
        }

        val y = act(sumEnd)
        println("Выходное значение НС: $y")

        return y
    }
}
