
public class Solution {

    public int minElement(int[] input) {
        int elementWithMinSumOfDigits = Integer.MAX_VALUE;
        for (int value : input) {
            int sumOfDigits = calculateSumOfDigits(value);
            elementWithMinSumOfDigits = Math.min(elementWithMinSumOfDigits, sumOfDigits);
        }
        return elementWithMinSumOfDigits;
    }

    private int calculateSumOfDigits(int value) {
        int sumOfDigits = 0;
        while (value > 0) {
            sumOfDigits += value % 10;
            value /= 10;
        }
        return sumOfDigits;
    }
}
