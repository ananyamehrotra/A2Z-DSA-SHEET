class Solution {
    public int longestPalindromeSubseq(String s) {
        String s1="";
        for(int i=s.length()-1;i>=0;i--)s1+=s.charAt(i);

        int[][] dp=new int[s.length()+1][s.length()+1];
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=s1.length();j++){
                if(s.charAt(i-1)==s1.charAt(j-1))dp[i][j]=dp[i-1][j-1]+1;
                else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[s.length()][s.length()];
    }
}