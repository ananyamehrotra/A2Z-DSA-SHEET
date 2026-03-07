class Solution {
    public String removeOuterParentheses(String s) {
        String str="";
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(c>0){
                    str+='(';
                }
                c++;
            }
            else{
                c--;
                if(c>0){
                    str+=')';
                }
            }
        }
        return str;
    }
}