class Solution {
    public int numOfSubarrays(int[] nums, int k, int t) {
        int sum=0;
        int c=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        if(sum/k>=t)c++;
    
        
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            if(sum/k>=t)c++;
        }
        return c;
    }
}