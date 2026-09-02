class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            if(i==1)c++;
            else{
                max=Math.max(max,c);
                c=0;
            }
        }
        return max>c?max:c;
    }
}