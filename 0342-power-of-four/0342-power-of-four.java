class Solution {
    public boolean isPowerOfFour(int n) {
        // 1. n > 0: Powers of 4 must be positive.
        // 2. (n & (n - 1)) == 0: Checks if n has exactly one bit set (power of 2).
        // 3. (n & 0x55555555) != 0: Ensures the single set bit is at an even position.
        return n > 0 && (n & (n - 1)) == 0 && (n & 0x55555555) != 0;
    }
}
