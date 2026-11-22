class Solution {
    public boolean checkString(String s) {
        
        if(s.indexOf("b")==-1)return true;
        if(s.lastIndexOf("a")>s.indexOf("b"))return false;
        return true;
    }
}