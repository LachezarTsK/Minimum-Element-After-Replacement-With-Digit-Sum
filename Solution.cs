
using System;

public class Solution
{
    public int MinElement(int[] input)
    {
        int elementWithMinSumOfDigits = int.MaxValue;
        foreach (int value in input)
        {
            int sumOfDigits = calculateSumOfDigits(value);
            elementWithMinSumOfDigits = Math.Min(elementWithMinSumOfDigits, sumOfDigits);
        }
        return elementWithMinSumOfDigits;
    }

    private int calculateSumOfDigits(int value)
    {
        int sumOfDigits = 0;
        while (value > 0)
        {
            sumOfDigits += value % 10;
            value /= 10;
        }
        return sumOfDigits;
    }
}
