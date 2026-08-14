class Solution {
    public int maximumLengthSubstring(String s) {
        int i=0,j=0;
        int max=0;
        HashMap<Character,Integer> h=new HashMap<>();
        while(j<s.length()){
            h.put(s.charAt(j),h.getOrDefault(s.charAt(j),0)+1);
            while(h.get(s.charAt(j))>2){
                h.put(s.charAt(i),h.get(s.charAt(i))-1);
                i++;
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}