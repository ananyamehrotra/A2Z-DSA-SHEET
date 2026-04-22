class Solution {
    private int[] parent, rank;
    public List<List<Integer>> findCriticalAndPseudoCriticalEdges(int n, int[][] edges) {
        int m = edges.length;
        Integer[] idx = new Integer[m];
        for (int i = 0; i < m; i++) idx[i] = i;

        int[][] augmented = new int[m][4];
        for (int i = 0; i < m; i++) {
            augmented[i][0] = edges[i][0];
            augmented[i][1] = edges[i][1];
            augmented[i][2] = edges[i][2];
            augmented[i][3] = i;
        }
        Arrays.sort(augmented, (a, b) -> a[2] - b[2]);

        int baseMST = kruskal(n, augmented, -1, -1);

        List<Integer> critical = new ArrayList<>();
        List<Integer> pseudoCritical = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            if (kruskal(n, augmented, i, -1) > baseMST) {
                critical.add(augmented[i][3]);
            } else if (kruskal(n, augmented, -1, i) == baseMST) {
                pseudoCritical.add(augmented[i][3]);
            }
        }

        return Arrays.asList(critical, pseudoCritical);
    }

    private int kruskal(int n, int[][] edges, int skipIdx, int forceIdx) {
        init(n);
        int weight = 0, count = 0;

        if (forceIdx != -1) {
            union(edges[forceIdx][0], edges[forceIdx][1]);
            weight += edges[forceIdx][2];
            count++;
        }

        for (int i = 0; i < edges.length; i++) {
            if (i == skipIdx) continue;
            if (union(edges[i][0], edges[i][1])) {
                weight += edges[i][2];
                count++;
            }
        }

        return count == n - 1 ? weight : Integer.MAX_VALUE;
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

    private boolean union(int x, int y) {
        int px = find(x), py = find(y);
        if (px == py) return false;
        if (rank[px] < rank[py]) { int t = px; px = py; py = t; }
        parent[py] = px;
        if (rank[px] == rank[py]) rank[px]++;
        return true;
    }
}