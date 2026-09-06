class Solution {
    public int maxSubArray(int[] nums) {
        int s = nums[0];
        int a = nums[0];

        for(int i = 1; i < nums.length; i++){
            s = Math.max(nums[i], s + nums[i]);
            a = Math.max(a, s);
        }

        return a;
    }
}