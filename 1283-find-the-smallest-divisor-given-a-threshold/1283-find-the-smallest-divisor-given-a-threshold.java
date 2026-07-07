class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=nums[0];

        for(int i:nums){
            high=Math.max(high,i);
        }

        while(low<high){
            int mid=low+(high-low)/2;
            if(possible(mid,nums,threshold))high=mid;
            else low=mid+1;
        }
        return low;
    }
    public boolean possible(int mid, int[] nums, int t){
        long sum=0;
        for(int n:nums){
            sum+=(n+mid-1)/mid;
        }
        return sum<=t;
    }
}