class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int b=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                b=i;
                break;
            }
        }
        if(b>=0){
            for(int i=n-1;i>=0;i--){
                if(nums[i]>nums[b]){
                    int temp=nums[i];
                    nums[i]=nums[b];
                    nums[b]=temp;
                    break;
                }
            }
        }
        reverse(nums, b + 1, n - 1);
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}