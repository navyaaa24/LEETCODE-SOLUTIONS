class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> ans = new ArrayList<>();

        int lastAdded = -1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == key) {
                int start = Math.max(0, i - k);
                int end = Math.min(nums.length - 1, i + k);

                start = Math.max(start, lastAdded + 1);

                for (int j = start; j <= end; j++) {
                    ans.add(j);
                }

                lastAdded = end;
            }
        }

        return ans;
    }
}