class Solution {
    public int missingNumber(int[] nums) {
        int s=0;
        int n=nums.length;
        for(int i:nums)s+=i;
        return (n*(n+1)/2)-s;
    }
}