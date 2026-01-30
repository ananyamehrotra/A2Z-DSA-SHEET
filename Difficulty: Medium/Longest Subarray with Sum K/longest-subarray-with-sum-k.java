// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> h=new HashMap<>();
        h.put(0,-1);
        int n=arr.length;
        int c=0,s=0,rem=0;
        for(int i=0;i<n;i++){
            s+=arr[i];
            if(s==k)c=Math.max(c,i+1);
            rem=s-k;
            if(h.containsKey(rem)){
                c=Math.max(c,(i-h.get(rem)));
            }
            if(!h.containsKey(s)){
                h.put(s, i);
            }
        }
        return c;
    }
}
