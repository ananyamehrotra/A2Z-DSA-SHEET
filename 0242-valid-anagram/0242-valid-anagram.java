class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        String c = new String(a);
        String d = new String(b);

        if(c.equals(d)) return true;
        return false;
    }
}