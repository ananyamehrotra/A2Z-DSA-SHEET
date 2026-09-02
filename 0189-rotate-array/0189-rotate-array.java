class Solution {
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        int n=nums.length;
        int[] temp=new int[nums.length];
        int j=0;
        for(int i=nums.length-k;i<nums.length;i++){
            temp[j++]=nums[i];
        }
        for(int i=n-k-1;i>=0;i--){
            nums[k+i]=nums[i];
        }
        for(int i=0;i<k;i++)nums[i]=temp[i];
    }
}