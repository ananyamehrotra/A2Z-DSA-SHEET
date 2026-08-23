class Solution {
    public boolean isPalindromic(String s) {
        char[] c=s.toCharArray();
        String str="";
        for(char ch:c){
            String b=Integer.toBinaryString(ch);
            while(b.length()<8)b='0'+b;
            str+=b;
        }
        int l=0;
        int r=str.length()-1;
        while(l<=r){
            if(str.charAt(l)!=str.charAt(r))return false;
            l++;
            r--;
        }
        return true;
    }
}