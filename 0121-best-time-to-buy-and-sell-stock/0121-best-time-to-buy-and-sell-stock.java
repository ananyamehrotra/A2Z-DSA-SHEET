class Solution {
    public int maxProfit(int[] arr) {
        int mp=arr[0];
        int bb=0;
        for(int i=1;i<arr.length;i++){
            mp=Math.min(mp,arr[i]);
            bb=Math.max(bb,arr[i]-mp);
        }
        return bb;
    }
}