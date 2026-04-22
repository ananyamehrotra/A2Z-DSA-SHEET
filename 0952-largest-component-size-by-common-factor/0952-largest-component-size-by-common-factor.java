class Solution {
    private int[] parent, rank;

    public int largestComponentSize(int[] nums) {
        int max = 0;
        for (int n : nums) max = Math.max(max, n);

        init(max + 1);

        for (int n : nums) {
            for (int f = 2; f * f <= n; f++) {
                if (n % f == 0) {
                    union(n, f);
                    union(n, n / f);
                }
            }
        }

        Map<Integer, Integer> compSize = new HashMap<>();
        int ans = 0;
        for (int n : nums) {
            int root = find(n);
            compSize.merge(root, 1, Integer::sum);
            ans = Math.max(ans, compSize.get(root));
        }
        return ans;
    }

    private void init(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;
    }

    private int find(int x) {
        if (parent[x] != x) parent[x] = find(parent[x]);
        return parent[x];
    }

    private void union(int x, int y) {
        int px = find(x), py = find(y);
        if (px == py) return;
        if (rank[px] < rank[py]) { int t = px; px = py; py = t; }
        parent[py] = px;
        if (rank[px] == rank[py]) rank[px]++;
        
    }
}