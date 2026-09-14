class Solution {
    public int subtractProductAndSum(int n) {
        int productOfDigits = 1;
        int sumOfDigits = 0;
        
        // Loop through the integer until all digits are extracted
        while (n > 0) {
            int lastDigit = n % 10; // Extract the last digit
            
            productOfDigits *= lastDigit; // Update the product
            sumOfDigits += lastDigit;       // Update the sum
            
            n /= 10; // Remove the last digit from n
        }
        
        // Return the difference between product and sum
        return productOfDigits - sumOfDigits;
    }
}
