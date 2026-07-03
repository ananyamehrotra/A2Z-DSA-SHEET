class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = binarySearch(nums, target);
        if (start == nums.length || nums[start] != target) {
            return new int[]{-1, -1};
        }
        int end = binarySearch(nums, target + 1) - 1;
        
        return new int[]{start, end};
    }
    private int binarySearch(int[] nums, int val) {
        int low = 0, high = nums.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] >= val) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
