class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int i=0;
        int sum=0;
        int c=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            while(i<j&&sum>goal){
                sum-=nums[i++];
            }
            if(sum==goal){
                c++;
                int k=i;
                while(k<j&&nums[k]==0){
                    c++;
                    k++;
                }
            }
        }
        return c;
    }
}