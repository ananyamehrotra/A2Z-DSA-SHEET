class Solution {
    public int missingInteger(int[] nums) {
        int max=0;
        int c=0;
        int s=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                s+=nums[i];
            }
            else break;
        }
        Arrays.sort(nums);
        for(int i:nums){
            if(s==i)s++;
        }
        return s;
    }
}