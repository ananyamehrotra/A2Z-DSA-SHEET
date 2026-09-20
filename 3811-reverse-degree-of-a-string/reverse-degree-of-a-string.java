class Solution {
    public int reverseDegree(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        String str="abcdefghijklmnopqrstuvwxyz";
        int c=26;
        for(char ch:str.toCharArray()){
            h.put(ch,c--);
        }
        int r=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            r+=(i+1)*h.get(ch);
        }
        return r;
    }
}