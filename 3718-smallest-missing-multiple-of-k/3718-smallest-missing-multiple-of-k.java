import java.util.HashSet;
import java.util.Set;

class Solution {
    public int missingMultiple(int[] nums, int k) {
        // Step 1: Insert all array elements into a HashSet for O(1) lookups
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        // Step 2: Start with the first positive multiple of k
        int multiple = k;
        
        // Step 3: Keep incrementing by k until we find a multiple not in the set
        while (set.contains(multiple)) {
            multiple += k;
        }
        
        return multiple;
    }
}
