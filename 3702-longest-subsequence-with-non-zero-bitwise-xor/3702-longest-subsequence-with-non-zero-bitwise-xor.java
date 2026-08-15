class Solution {
    public int longestSubsequence(int[] nums) {
        int x=0,c=0;
        for(int i:nums){
            x=x^i;
            if(i==0)c++;
        }
        if(x!=0) return nums.length;
        if(c==nums.length)return 0;
        return nums.length-1;
    }
}