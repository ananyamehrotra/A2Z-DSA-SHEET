class Solution {
    public int minInsertions(String s) {
        StringBuilder sb=new StringBuilder(s);
        String s1=sb.reverse().toString();
        if(s1.equals(s))return 0;

        int[][] dp=new int[s.length()+1][s.length()+1];
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=s.length();j++){
                if(s.charAt(i-1)==s1.charAt(j-1))dp[i][j]=1+dp[i-1][j-1];
                else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return s.length()-dp[s.length()][s.length()];
    }
}