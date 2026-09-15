class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        
        // Swap elements from the outside moving inward
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            // Move pointers closer to the center
            left++;
            right--;
        }
    }
}
