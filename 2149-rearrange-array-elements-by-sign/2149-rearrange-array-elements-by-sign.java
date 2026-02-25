class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] p=new int[nums.length/2];
        int[] n=new int[nums.length/2];
        int c=0, k=0;
        for(int i:nums){
            if(i>0)p[k++]=i;
            else n[c++]=i;
        }
        
        for(int i=0, j=0;i<nums.length&&j<k;i+=2,j++) nums[i]=p[j];
        for(int i=1, j=0;i<nums.length&&j<k;i+=2,j++) nums[i]=n[j];

        return nums;
    }
}