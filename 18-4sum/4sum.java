class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ll=new ArrayList<>();
        Arrays.sort(nums);
        for(int l=0;l<nums.length-3;l++){
            if(l>0&&nums[l]==nums[l-1])continue;
            long t1=(long)target-nums[l];
            for(int k=l+1;k<nums.length-2;k++){
                if(k>l+1&&nums[k]==nums[k-1])continue;
                long t=(long)t1-nums[k];
                int i=k+1;
                int j=nums.length-1;
                while(i<j){
                    long s=(long)nums[i]+nums[j];
                    if(s==t){
                        ll.add(Arrays.asList(nums[l],nums[k],nums[i],nums[j]));
                        i++;
                        j--;
                        while(i<j&&nums[i]==nums[i-1])i++;
                        while(i<j&&nums[j]==nums[j+1])j--;
                    }
                    else if(t<s)j--;
                    else i++;
                }
            }
        }
        return ll;
    }
}