class Solution {
    public int shortestMatchingSubstring(String s, String p) {
        int star1 = p.indexOf('*');
        int star2 = p.lastIndexOf('*');

        String left  = p.substring(0, star1);
        String mid   = p.substring(star1 + 1, star2);
        String right = p.substring(star2 + 1);

        if (left.isEmpty() && mid.isEmpty() && right.isEmpty()) return 0;

        List<Integer> leftStarts  = kmpSearch(s, left);
        List<Integer> midStarts   = kmpSearch(s, mid);
        List<Integer> rightStarts = kmpSearch(s, right);

        int ans = Integer.MAX_VALUE;

        for (int ls : leftStarts) {
            int mi = lowerBound(midStarts, ls + left.length());
            if (mi == midStarts.size()) continue;

            int ms = midStarts.get(mi);

            int ri = lowerBound(rightStarts, ms + mid.length());
            if (ri == rightStarts.size()) continue;

            int rs = rightStarts.get(ri);

            ans = Math.min(ans, rs + right.length() - ls);
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    private int lowerBound(List<Integer> list, int target) {
        int lo = 0, hi = list.size();
        while (lo < hi) {
            int m = (lo + hi) >>> 1;
            if (list.get(m) < target) lo = m + 1;
            else hi = m;
        }
        return lo;
    }

    private int[] buildLPS(String pat) {
        int n = pat.length();
        int[] lps = new int[n];
        for (int i = 1, len = 0; i < n; ) {
            if (pat.charAt(i) == pat.charAt(len)) {
                lps[i++] = ++len;
            } else if (len > 0) {
                len = lps[len - 1];
            } else {
                lps[i++] = 0;
            }
        }
        return lps;
    }

    private List<Integer> kmpSearch(String text, String pat) {
        List<Integer> starts = new ArrayList<>();
        if (pat.isEmpty()) {
            for (int i = 0; i <= text.length(); i++) starts.add(i);
            return starts;
        }
        int[] lps = buildLPS(pat);
        for (int i = 0, j = 0; i < text.length(); ) {
            if (text.charAt(i) == pat.charAt(j)) {
                i++; j++;
            }
            if (j == pat.length()) {
                starts.add(i - j);
                j = lps[j - 1];
            } else if (i < text.length() && text.charAt(i) != pat.charAt(j)) {
                if (j > 0) j = lps[j - 1];
                else i++;
            }
        }
        return starts;
    }
}