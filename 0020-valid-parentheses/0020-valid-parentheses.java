class Solution {
    public boolean isValid(String s) {
        Deque<Character> d=new ArrayDeque<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if("({[".indexOf(ch)>-1)d.push(ch);
            else{
                if(d.isEmpty())return false;
                char c=d.peek();
                if(c=='('&&ch==')'||c=='{'&&ch=='}'||c=='['&&ch==']')d.pop();
                else return false;
            }
        }
        return d.isEmpty();
    }
}