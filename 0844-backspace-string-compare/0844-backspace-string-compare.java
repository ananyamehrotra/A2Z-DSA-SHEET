class Solution {
    public boolean backspaceCompare(String s, String t) {
        Deque<Character> d1=new ArrayDeque<>();
        Deque<Character> d2=new ArrayDeque<>();
        for (char ch:s.toCharArray()) {
            if(ch=='#') {
                if(!d1.isEmpty())
                    d1.pop();
            } else{
                d1.push(ch);
            }
        }
        for (char ch:t.toCharArray()) {
            if(ch=='#') {
                if(!d2.isEmpty())
                    d2.pop();
            } else{
                d2.push(ch);
            }
        }
        while (!d1.isEmpty() && !d2.isEmpty()) {
            if (d1.pop() != d2.pop())
                return false;
        }

        return d1.isEmpty() && d2.isEmpty();
    }
}