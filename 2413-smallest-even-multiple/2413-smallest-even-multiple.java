class Solution {
    public int smallestEvenMultiple(int n) {
        // If n is even, the smallest multiple of 2 and n is n itself.
        // If n is odd, the smallest multiple is n * 2.
        return (n % 2 == 0) ? n : n * 2;
    }
}
