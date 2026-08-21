class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        for(int mask=0;mask<(1<<nums.length);mask++){
            List<Integer> curr=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                if((mask&(1<<i))!=0)
                curr.add(nums[i]);
            }
            l.add(curr);
        }
        return l;
    }
}