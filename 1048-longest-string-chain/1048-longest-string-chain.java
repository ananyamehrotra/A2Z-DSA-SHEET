class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(a, b) -> a.length() - b.length());
        int[] dp=new int[words.length];
        int ans=1;
        Arrays.fill(dp,1);
        for(int i=0;i<words.length;i++){
            for(int j=0;j<i;j++){
                if(check(words[j],words[i]))dp[i]=Math.max(dp[i],dp[j]+1);
            }
            ans=Math.max(ans,dp[i]);
        }
        return ans;
    }
    boolean check(String a, String b) {

        if(b.length() != a.length() + 1)
            return false;

        int i = 0, j = 0;

        boolean skipped = false;

        while(i < a.length() && j < b.length()) {

            if(a.charAt(i) == b.charAt(j)) {
                i++;
                j++;
            } 
            else {
                if(skipped)
                    return false;

                skipped = true;
                j++;
            }
        }

        return true;
    }
}