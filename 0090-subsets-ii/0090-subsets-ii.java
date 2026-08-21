class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set=new HashSet<>();
        int n=nums.length;

        for(int mask=0;mask<(1<<n);mask++){
            List<Integer> temp=new ArrayList<>();

            for(int i=0;i<n;i++){
                if((mask&(1<<i))!=0)
                    temp.add(nums[i]);
            }

            set.add(temp);
        }

        return new ArrayList<>(set);
    }
}