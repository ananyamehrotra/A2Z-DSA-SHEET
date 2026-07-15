class Solution {
    public int numberOfSubstrings(String s) {
        if(s.indexOf('a')==-1||s.indexOf('b')==-1||s.indexOf('c')==-1)return 0;

        int[] freq = new int[3];
        int c=0;

        int i=0;
        for(int j=0;j<s.length();j++){
            freq[s.charAt(j)-'a']++;
            
            while(freq[0] > 0 && freq[1] > 0 && freq[2] > 0){
                c+=s.length()-j;
                freq[s.charAt(i) - 'a']--;
                i++;
            }
        }
        return c;
    }
}