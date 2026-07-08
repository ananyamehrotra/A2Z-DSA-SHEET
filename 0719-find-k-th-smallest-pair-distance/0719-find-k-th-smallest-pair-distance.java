class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums[nums.length - 1] - nums[0];
        int firstTrueIndex = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (count(mid, nums) >= k) {
                firstTrueIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return firstTrueIndex;
    }
    private int count(int targetDistance, int[] nums) {
        int pairCount = 0;
        for (int i = 0; i < nums.length; ++i) {
            int left = 0;
            int right = i - 1;
            int firstTrueIndex = i;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                int minimumValue = nums[i] - targetDistance;

                if (nums[mid] >= minimumValue) {
                    firstTrueIndex = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            pairCount += i - firstTrueIndex;
        }
        return pairCount;
    }
}