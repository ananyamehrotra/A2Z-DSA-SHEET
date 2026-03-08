class Solution {
    public boolean closeStrings(String word1, String word2) {
        char[] a=word1.toCharArray();
        char[] b=word2.toCharArray();

        int[] f=new int[26];
        int[] g=new int[26];
        for(char c:a){
            f[c-'a']++;
        }
        for(char c:b){
            g[c-'a']++;
        }

        for(int i=0;i<26;i++){
            if ((f[i] == 0 && g[i] != 0) || (f[i] != 0 && g[i] == 0))
                return false;
        }
        Arrays.sort(f);
        Arrays.sort(g);

        return Arrays.equals(f,g);
    }
}