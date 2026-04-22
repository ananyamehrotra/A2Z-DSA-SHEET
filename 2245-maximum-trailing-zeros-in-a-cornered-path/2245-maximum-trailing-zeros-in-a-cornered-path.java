class Solution {
    public int maxTrailingZeros(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        int[][] r2 = new int[m][n + 1];
        int[][] r5 = new int[m][n + 1];
        int[][] c2 = new int[m + 1][n];
        int[][] c5 = new int[m + 1][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                r2[i][j + 1] = r2[i][j] + countFactor(grid[i][j], 2);
                r5[i][j + 1] = r5[i][j] + countFactor(grid[i][j], 5);
            }
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                c2[i + 1][j] = c2[i][j] + countFactor(grid[i][j], 2);
                c5[i + 1][j] = c5[i][j] + countFactor(grid[i][j], 5);
            }
        }

        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int f2 = countFactor(grid[i][j], 2);
                int f5 = countFactor(grid[i][j], 5);

                int left2  = r2[i][j + 1];
                int right2 = r2[i][n] - r2[i][j] + f2 - f2; // = r2[i][n] - r2[i][j+1] + f2... simplified below
                int up2    = c2[i + 1][j];
                int down2  = c2[m][j] - c2[i][j] + f2 - f2;

                int left5  = r5[i][j + 1];
                int right5 = r5[i][n] - r5[i][j + 1] + f5;
                int up5    = c5[i + 1][j];
                int down5  = c5[m][j] - c5[i + 1][j] + f5;

                right2 = r2[i][n] - r2[i][j + 1] + f2;
                down2  = c2[m][j] - c2[i + 1][j] + f2;

                // re-derive cleanly
                left2  = r2[i][j + 1];              // col 0..j inclusive
                right2 = r2[i][n] - r2[i][j];       // col j..n-1 inclusive
                up2    = c2[i + 1][j];               // row 0..i inclusive
                down2  = c2[m][j] - c2[i][j];       // row i..m-1 inclusive

                left5  = r5[i][j + 1];
                right5 = r5[i][n] - r5[i][j];
                up5    = c5[i + 1][j];
                down5  = c5[m][j] - c5[i][j];

                // 4 L-shapes; corner counted in both directions so subtract once
                ans = Math.max(ans, Math.min(left2  + up2   - f2, left5  + up5   - f5));
                ans = Math.max(ans, Math.min(left2  + down2 - f2, left5  + down5 - f5));
                ans = Math.max(ans, Math.min(right2 + up2   - f2, right5 + up5   - f5));
                ans = Math.max(ans, Math.min(right2 + down2 - f2, right5 + down5 - f5));
            }
        }
        return ans;
    }

    private int countFactor(int n, int f) {
        int cnt = 0;
        while (n % f == 0) { n /= f; cnt++; }
        return cnt;
    }
}