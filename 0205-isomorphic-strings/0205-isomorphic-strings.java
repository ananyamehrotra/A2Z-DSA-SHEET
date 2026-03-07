class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] m = new int[256];
        int[] n = new int[256];

        for(int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            char d = t.charAt(i);

            if(m[c] != n[d]) return false;

            m[c] = i + 1;
            n[d] = i + 1;
        }
        return true;
    }
}