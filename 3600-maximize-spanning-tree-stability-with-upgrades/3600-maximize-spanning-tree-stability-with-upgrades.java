class Solution {
    private int[] parent, rank;

    public int maxStability(int n, int[][] edges, int k) {
        int lo = 1, hi = 0, ans = -1;
        for (int[] e : edges) hi = Math.max(hi, e[2] * 2);

        while (lo <= hi) {
            int mid = (lo + hi) >>> 1;
            if (canAchieve(n, edges, k, mid)) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    private boolean canAchieve(int n, int[][] edges, int k, int minStr) {
        init(n);
        int used = 0, count = 0;

        List<int[]> mustEdges    = new ArrayList<>();
        List<int[]> freeEdges    = new ArrayList<>();
        List<int[]> upgradeEdges = new ArrayList<>();

        for (int[] e : edges) {
            int s = e[2], must = e[3];
            if (must == 1) {
                if (s < minStr) return false;
                mustEdges.add(e);
            } else {
                if (s >= minStr)          freeEdges.add(e);
                else if (s * 2 >= minStr) upgradeEdges.add(e);
            }
        }

        for (int[] e : mustEdges) {
            if (!union(e[0], e[1])) return false;
            count++;
        }

        freeEdges.sort((a, b) -> b[2] - a[2]);
        for (int[] e : freeEdges) {
            if (union(e[0], e[1])) count++;
        }

        upgradeEdges.sort((a, b) -> b[2] - a[2]);
        for (int[] e : upgradeEdges) {
            if (used >= k) break;
            if (union(e[0], e[1])) {
                count++;
                used++;
            }
        }

        return count == n - 1;
    }

    private void init(int n) {
        parent = new int[n];
        rank   = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;
    }

    private int find(int x) {
        if (parent[x] != x) parent[x] = find(parent[x]);
        return parent[x];
    }

    private boolean union(int x, int y) {
        int px = find(x), py = find(y);
        if (px == py) return false;
        if (rank[px] < rank[py]) { int t = px; px = py; py = t; }
        parent[py] = px;
        if (rank[px] == rank[py]) rank[px]++;
        return true;
    }
}