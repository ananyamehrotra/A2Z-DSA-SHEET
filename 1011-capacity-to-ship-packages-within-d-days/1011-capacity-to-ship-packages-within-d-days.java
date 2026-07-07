class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=weights[0];
        int high=0;
        for(int i:weights){
            low=Math.max(low,i);
            high+=i;
        }

        while(low<high){
            int mid=low+(high-low)/2;

            if(possible(mid,weights,days))high=mid;
            else low=mid+1;
        }
        return low;
    }
    public boolean possible(int c, int[] weights, int d){
        long s=0;
        int days=1;
        for(int w:weights){
            if(s+w<=c){
                s+=w;
            }
            else{
                days++;
                s=w;
            }
        }
        return days<=d;
    }
}