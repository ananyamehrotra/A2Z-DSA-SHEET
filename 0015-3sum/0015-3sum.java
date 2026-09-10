class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        Arrays.sort(nums);
        for(int k=0;k<nums.length-2;k++){
            if(k>0&&nums[k]==nums[k-1])continue;
            int t=-nums[k];
            int i=k+1;
            int j=nums.length-1;
            while(i<j){
                int s=nums[i]+nums[j];
                if(s==t){
                    l.add(Arrays.asList(nums[k],nums[i],nums[j]));
                    i++;
                    j--;
                    while(i<j&&nums[i]==nums[i-1])i++;
                    while(i<j&&nums[j]==nums[j+1])j--;
                }
                else if(t<s)j--;
                else i++;
            }
        }
        return l;
    }
}