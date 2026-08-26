class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long sum=0;
        int j=0;
        int ans=1;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while((long)nums[i]*(i-j+1)-sum>k){
                sum-=nums[j];
                j++;
            }
            ans=Math.max(i-j+1,ans);
        }
        return ans;
    }
}