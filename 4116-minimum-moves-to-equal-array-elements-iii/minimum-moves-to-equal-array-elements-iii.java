class Solution {
    public int minMoves(int[] nums) {
        int max=0;
       for(int i:nums) max=Math.max(max,i);
        int m=0;
        for(int i:nums) m+=max-i;

        return m;
    }
}