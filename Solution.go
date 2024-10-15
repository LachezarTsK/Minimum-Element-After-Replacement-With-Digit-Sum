
package main

import (
    "fmt"
    "math"
)

func minElement(input []int) int {
    elementWithMinSumOfDigits := math.MaxInt32
    for _, value := range input {
        sumOfDigits := calculateSumOfDigits(value)
        elementWithMinSumOfDigits = min(elementWithMinSumOfDigits, sumOfDigits)
    }
    return elementWithMinSumOfDigits
}

func calculateSumOfDigits(value int) int {
    sumOfDigits := 0
    for value > 0 {
        sumOfDigits += value % 10
        value /= 10
    }
    return sumOfDigits
}
