class Solution {
    public int maxVowels(String s, int k) {
        int c=0;
        String a="";
        for(int i=0;i<k;i++){
            a+=s.charAt(i);
            if("aeiou".indexOf(s.charAt(i))>-1)c++;
        }
        int max=c;
        
        for(int i=k;i<s.length();i++){
            a+=s.charAt(i)-s.charAt(i-k);
            if("aeiou".indexOf(s.charAt(i))>-1)c++;
            if("aeiou".indexOf(s.charAt(i-k))>-1)c--;
            max=Math.max(max,c);
        }
        return max;
    }
}