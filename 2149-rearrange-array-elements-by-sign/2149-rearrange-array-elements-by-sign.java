class Solution {
    public int[] rearrangeArray(int[] nums) {
        int a=0,b=1;
        int[] arr=new int[nums.length];
        for(int i:nums){
            if(i>=0&&a<nums.length){
                arr[a]=i;
                a+=2;
            }
            else if(i<0&&b<nums.length){
                arr[b]=i;
                b+=2;
            }
        }
        return arr;
    }
}