class Solution {
    public int countConsistentStrings(String a, String[] w) {
        int c=0;
        for(String s:w){
            boolean f=true;
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(a.indexOf(ch)==-1){
                    f=false;
                    break;
                }
            }
            if(f)c++;
        }
        return c;
    }
}