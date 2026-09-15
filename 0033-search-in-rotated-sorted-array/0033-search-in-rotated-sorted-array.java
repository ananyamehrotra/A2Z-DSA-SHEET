class Solution {
    public int search(int[] nums, int t) {
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==t)return mid;
            if(nums[l]<=nums[mid]){
                if(t<=nums[mid]&&t>=nums[l])r=mid-1;
                else l=mid+1;
            }
            else{
                if(t>=nums[mid]&&t<=nums[r])l=mid+1;
                else r=mid-1;
            }
        }
        return -1;
    }
}