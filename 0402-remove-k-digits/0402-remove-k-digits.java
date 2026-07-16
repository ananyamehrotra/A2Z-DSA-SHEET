class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> d=new ArrayDeque<>();
        int c=k;
        for(char ch:num.toCharArray()){
            while(!d.isEmpty()&&k>0&&d.peek()>ch){
                d.pop();
                k--;
            }
            d.push(ch);
        }
        while(k>0){
            d.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();

        while(!d.isEmpty())
            sb.append(d.pop());

        sb.reverse();

        while(sb.length()>0&&sb.charAt(0)=='0')
            sb.deleteCharAt(0);

        return sb.length()==0?"0":sb.toString();
    }
}