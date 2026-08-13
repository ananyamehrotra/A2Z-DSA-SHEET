class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int[] dp=new int[nums.length];
        int[] p=new int[nums.length];
        int ans=1,last=0;
        Arrays.fill(dp,1);
        for(int i=0;i<nums.length;i++){
            p[i]=i;
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0&&dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                    p[i]=j;}
            }
            if(dp[i]>dp[last])last=i;
        }
        List<Integer> l=new ArrayList<>();
        while(p[last]!=last){
            l.add(nums[last]);
            last=p[last];
        }
        l.add(nums[last]);
        Collections.reverse(l);
        return l;
    }
}