class Solution {
    public int maxProfit(int[] prices) {
        int mp=0;
        int buy=prices[0];
        for(int i=1;i<prices.length;i++){
            mp=Math.max(mp,prices[i]-buy);
            buy=Math.min(buy,prices[i]);
        }
        return mp;
    }
}