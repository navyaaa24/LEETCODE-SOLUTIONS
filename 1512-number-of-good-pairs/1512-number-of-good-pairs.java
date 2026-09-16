class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        // Since 1 <= nums[i] <= 100, an array of size 101 covers all values
        int[] count = new int[101]; 
        
        for (int num : nums) {
            // Add the number of times we've seen this element before
            goodPairs += count[num];
            // Increment the frequency of the current element
            count[num]++;
        }
        
        return goodPairs;
    }
}
