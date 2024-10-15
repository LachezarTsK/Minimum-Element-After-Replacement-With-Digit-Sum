
function minElement(input: number[]): number {
    let elementWithMinSumOfDigits = Number.MAX_SAFE_INTEGER;
    for (let value of input) {
        const sumOfDigits = calculateSumOfDigits(value);
        elementWithMinSumOfDigits = Math.min(elementWithMinSumOfDigits, sumOfDigits);
    }
    return elementWithMinSumOfDigits;
};

function calculateSumOfDigits(value: number): number {
    let sumOfDigits = 0;
    while (value > 0) {
        sumOfDigits += value % 10;
        value = Math.floor(value / 10);
    }
    return sumOfDigits;
}
