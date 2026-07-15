class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0) {
            return "";
        }
        int[] map = new int[128];
        for (char c : t.toCharArray()) {
            map[c]++;
        }
        int required = t.length();
        int formed = 0;
        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int minLeft = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            if (map[c] > 0) {
                formed++;
            }
            map[c]--;
            right++;
            while (formed == required) {
                if (right - left < minLen) {
                    minLen = right - left;
                    minLeft = left;
                }

                char charAtLeft = s.charAt(left);
                map[charAtLeft]++;
                if (map[charAtLeft] > 0) {
                    formed--;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLen);
    }
}