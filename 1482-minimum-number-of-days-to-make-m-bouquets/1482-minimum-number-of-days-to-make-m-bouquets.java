class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low=bloomDay[0];
        int high=bloomDay[0];

        if((long)m*k>bloomDay.length) return -1;
        for(int i:bloomDay){
            low=Math.min(low,i);
            high=Math.max(high,i);
        }
        int n=0;
        while(low<high){
            int mid=low+(high-low)/2;

            if(possible(mid,bloomDay,m,k)){
                high=mid;
            }
            else low=mid+1;
        }
        return low;
    }
    public boolean possible(int day, int[] b, int m, int k){
        int c=0; int bo=0;
        for(int i:b){
            if(i<=day)c++;
            else{
                bo += c / k;
                c=0;
            }
        }
        bo += c / k;
        return bo>=m;
    }
}