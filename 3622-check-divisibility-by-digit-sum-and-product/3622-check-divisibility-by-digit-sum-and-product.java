class Solution {
    public boolean checkDivisibility(int n) {
        int original = n;
        int digitSum = 0;
        int digitProduct = 1; // Must be initialized to 1 for correct multiplication
        
        // Step 1: Extract digits one by one
        while (n > 0) {
            int digit = n % 10;      // Get the rightmost digit
            digitSum += digit;        // Add to the running sum
            digitProduct *= digit;    // Multiply to the running product
            n /= 10;                  // Remove the rightmost digit
        }
        
        // Step 2: Check if original number is divisible by (digitSum + digitProduct)
        int divisor = digitSum + digitProduct;
        return original % divisor == 0;
    }
}
