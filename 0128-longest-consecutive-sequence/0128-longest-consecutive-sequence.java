class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int c=1, k=0;
        int n=nums.length;
        int max=0;
        for(int i=0;i<n-1;i++){
            if((nums[i+1]-nums[i])==1){
                c++;                
            }
            else if((nums[i+1]-nums[i])==0)continue;
            else{
                max=Math.max(max,c);
                c=1;
            }
        }
        return Math.max(max, c);
    }
}