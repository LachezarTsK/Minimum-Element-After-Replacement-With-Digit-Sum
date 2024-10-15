
import kotlin.math.min

class Solution {
    
    fun minElement(input: IntArray): Int {
        var elementWithMinSumOfDigits = Int.MAX_VALUE
        for (value in input) {
            var sumOfDigits = calculateSumOfDigits(value)
            elementWithMinSumOfDigits = min(elementWithMinSumOfDigits, sumOfDigits)
        }
        return elementWithMinSumOfDigits
    }

    private fun calculateSumOfDigits(value: Int): Int {
        var value = value
        var sumOfDigits = 0
        while (value > 0) {
            sumOfDigits += value % 10
            value /= 10
        }
        return sumOfDigits
    }
}
