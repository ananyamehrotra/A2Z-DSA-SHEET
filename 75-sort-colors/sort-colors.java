class Solution {
    public void sortColors(int[] nums) {
        int[] c=new int[3];
        for(int i:nums)c[i]++;

        for(int i=0;i<c[0];i++)nums[i]=0;
        for(int i=c[0];i<c[0]+c[1];i++)nums[i]=1;
        for(int i=c[0]+c[1];i<nums.length;i++)nums[i]=2;
    }
}