class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq=new int[256];
        if(s.length()!=t.length())return false;
        for(char ch:s.toCharArray())freq[ch-'a']++;

        for(char ch:t.toCharArray()){
            if(freq[ch-'a']==0)return false;
            freq[ch-'a']--;
        }
        return true;
    }
}