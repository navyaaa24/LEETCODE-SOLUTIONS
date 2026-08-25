class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int ans[]=new int[n];
        k=k%n;
        int j=0;
        for(int i=n-k;i<=n-1;i++){
            ans[j++]=nums[i];
        }
        for(int i=0;i<=n-k-1;i++){
            ans[j++]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=ans[i];
            System.out.print(nums[i]);
        }
        
    }
}