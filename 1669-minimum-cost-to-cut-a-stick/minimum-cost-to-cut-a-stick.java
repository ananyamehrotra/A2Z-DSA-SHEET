class Solution {
    public int minCost(int n, int[] cuts) {
        int m = cuts.length;

        int[] c = new int[m + 2];
        for(int i = 0; i < m; i++)
            c[i + 1] = cuts[i];

        c[0] = 0;
        c[m + 1] = n;

        Arrays.sort(c);

        int[][] dp = new int[m + 2][m + 2];

        for(int len = 2; len <= m + 1; len++) {

            for(int l = 0; l + len <= m + 1; l++) {

                int r = l + len;
                dp[l][r] = Integer.MAX_VALUE;

                for(int k = l + 1; k < r; k++) {

                    dp[l][r] = Math.min(
                        dp[l][r],
                        c[r] - c[l]
                        + dp[l][k]
                        + dp[k][r]
                    );
                }
            }
        }

        return dp[0][m + 1];
    }
}