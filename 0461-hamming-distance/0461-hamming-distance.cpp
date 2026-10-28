

class Solution {
public:
    int hammingDistance(int x, int y) {
        int xorValue = x ^ y;
        int count = 0;

        while (xorValue != 0) {
            count += xorValue & 1;
            xorValue = xorValue >> 1;
        }

        return count;
    }
};
