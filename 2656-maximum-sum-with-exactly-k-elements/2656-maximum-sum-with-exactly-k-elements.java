class Solution {
    public int maximizeSum(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;
        int max = nums[0];
        for(int i = 1; i < n; i++){
            if(nums[i] > max) max = nums[i];
        }
        return (max*k) + (k *(k-1)/2);
    }
}