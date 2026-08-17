class Solution {
    public int maxCoins(int[] nums) {
        int[] b=new int[nums.length+2];
        for(int i=0;i<nums.length;i++)b[i+1]=nums[i];
        b[0]=1;
        b[b.length-1]=1;
        int[][] dp=new int[nums.length+2][nums.length+2];
        for(int len=2;len<=nums.length+1;len++){
            for(int i=0;i+len<=nums.length+1;i++){
                int j=len+i;
                for(int k=i+1;k<j;k++){
                    dp[i][j]=Math.max(dp[i][j],dp[i][k]+dp[k][j]+b[i]*b[k]*b[j]);
                }
            }
        }
        return dp[0][nums.length+1];
    }
}