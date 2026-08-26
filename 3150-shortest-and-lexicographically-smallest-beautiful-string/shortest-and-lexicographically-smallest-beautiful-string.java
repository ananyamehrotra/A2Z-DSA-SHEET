class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int i=0;
        int j=0;
        int c=0;
        String ans="";
        while(j<s.length()){
            char ch=s.charAt(j);
            if(ch=='1')c++;
            while(c==k){
                String curr=s.substring(i,j+1);
                if(ans.equals("")||curr.length() < ans.length() ||
                   (curr.length() == ans.length()
                    && curr.compareTo(ans) < 0))ans=curr;
                if(s.charAt(i)=='1')c--;
                i++;
            }
            j++;
        }
        return ans;
    }
}