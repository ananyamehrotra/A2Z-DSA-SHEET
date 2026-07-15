class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int i=0;
        int c=0;
        int d=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]%2==1)d++;
            while(i<j&&d>k){
                if(nums[i]%2==1)d--;
                i++;
            }
            if(d==k){
                c++;
                int e=i;
                while(e<j&&nums[e]%2==0){
                    c++;
                    e++;
                }
            }
        }
        return c;
    }
}