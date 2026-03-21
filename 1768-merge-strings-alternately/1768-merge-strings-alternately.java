class Solution {
    public String mergeAlternately(String w1, String w2) {
        String s="";
        int i=0;
        while(i<w1.length()&&i<w2.length()){
            s+=w1.charAt(i);
            s+=w2.charAt(i++);
        }
        while(i<w1.length())s+=w1.charAt(i++);
        while(i<w2.length())s+=w2.charAt(i++);
        return s;
    }
}