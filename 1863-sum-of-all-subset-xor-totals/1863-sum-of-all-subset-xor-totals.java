class Solution {

    int ans = 0;

    public int subsetXORSum(int[] nums) {
        backtrack(nums, 0, 0);
        return ans;
    }

    private void backtrack(int[] nums, int idx, int xor) {

        if (idx == nums.length) {
            ans += xor;
            return;
        }

        // include
        backtrack(nums, idx + 1, xor ^ nums[idx]);

        // exclude
        backtrack(nums, idx + 1, xor);
    }
}