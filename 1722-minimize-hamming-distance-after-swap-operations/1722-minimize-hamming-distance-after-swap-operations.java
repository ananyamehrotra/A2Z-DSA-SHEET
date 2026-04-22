class Solution {
    private int[] parent, rank;

    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        int n = source.length;
        init(n);

        for (int[] swap : allowedSwaps) {
            union(swap[0], swap[1]);
        }

        Map<Integer, List<Integer>> components = new HashMap<>();
        for (int i = 0; i < n; i++) {
            components.computeIfAbsent(find(i), x -> new ArrayList<>()).add(i);
        }

        int hamming = 0;

        for (List<Integer> group : components.values()) {
            Map<Integer, Integer> freq = new HashMap<>();
            for (int i : group) {
                freq.merge(source[i], 1, Integer::sum);
            }
            for (int i : group) {
                int t = target[i];
                if (freq.getOrDefault(t, 0) > 0) {
                    freq.merge(t, -1, Integer::sum);
                } else {
                    hamming++;
                }
            }
        }

        return hamming;
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