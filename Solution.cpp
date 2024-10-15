
#include <vector>
#include <limits>
#include <algorithm>
using namespace std;

class Solution {

public:
    int minElement(const vector<int>& input) const {
        int elementWithMinSumOfDigits = numeric_limits<int>::max();
        for (const auto& value : input) {
            int sumOfDigits = calculateSumOfDigits(value);
            elementWithMinSumOfDigits = min(elementWithMinSumOfDigits, sumOfDigits);
        }
        return elementWithMinSumOfDigits;
    }

private:
    int calculateSumOfDigits(int value) const {
        int sumOfDigits = 0;
        while (value > 0) {
            sumOfDigits += value % 10;
            value /= 10;
        }
        return sumOfDigits;
    }
};
