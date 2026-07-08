class Solution {
    public int splitArray(int[] nums, int k) {
        int low=0;
        int high=0;
        for(int i:nums){
            low=Math.max(low,i);
            high+=i;
        }

        while(low<high){
            int mid=low+(high-low)/2;

            if(possible(nums,k,mid))high=mid;
            else low=mid+1;
        }
        return low;
    }
    public boolean possible(int[] a, int k, int limit){
        int p=0;
        int u=1;
        for(int i:a){
            if(p+i<=limit)p+=i;
            else{
                u++;
                p=i;
                if(u>k)return false;
            }
        }
        return true;
    }
}