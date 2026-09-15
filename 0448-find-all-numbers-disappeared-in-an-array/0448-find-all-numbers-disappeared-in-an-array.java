import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        // Step 1: Mark visited indices by negating the values at those positions
        for (int i = 0; i < nums.length; i++) {
            // Use Math.abs because the element might have already been negated
            int index = Math.abs(nums[i]) - 1; 
            
            // If the element at the target index is positive, make it negative
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }
        
        // Step 2: Identify indices that remain positive
        for (int i = 0; i < nums.length; i++) {
            // A positive value means the number (i + 1) was never seen
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        
        return result;
    }
}
