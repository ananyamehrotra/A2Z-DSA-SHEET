class Solution {
    public int countDominantElements(int[] nums) {
        int c=0;
        if(nums.length==1)return 1;
        for(int i=1;i<nums.length-1;i++){
            if(2*nums[i]>=(nums[i-1]+nums[i+1]))c++;
        }
        if(nums[0]>=nums[1])c++;
        if(nums[nums.length-1]>=nums[nums.length-2])c++;

        return c;
    }
}