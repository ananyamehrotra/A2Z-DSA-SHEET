class Solution {
    public int removeDuplicates(int[] nums) {
        int y=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[y]=nums[i];
                y++;
            }
        }
        return y;
    }
}