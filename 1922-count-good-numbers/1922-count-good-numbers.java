class Solution {
    private static final int MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        // Calculate the number of even and odd indices
        long evenIndices = (n + 1) / 2;
        long oddIndices = n / 2;

        // Calculate 5^evenIndices % MOD and 4^oddIndices % MOD
        long choiceEven = power(5, evenIndices);
        long choiceOdd = power(4, oddIndices);

        // Combine the results modulo 10^9 + 7
        return (int) ((choiceEven * choiceOdd) % MOD);
    }

    // Iterative function to calculate (base^exp) % MOD in O(log exp) time
    private long power(long base, long exp) {
        long result = 1;
        base = base % MOD;

        while (exp > 0) {
            // If exp is odd, multiply the base with the result
            if ((exp & 1) == 1) {
                result = (result * base) % MOD;
            }
            // exp must be even now, square the base and divide exp by 2
            base = (base * base) % MOD;
            exp >>= 1; // Bitwise right shift equivalent to exp / 2
        }
        return result;
    }
}
