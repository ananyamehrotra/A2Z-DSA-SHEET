class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int a=0;
        for(int i:nums){
            if(c==0)a=i;
            if(i==a)c++;
            else c--;
        }
        return a;
    }
}