class Solution {
    public long minimumTime(int[] time, int tt) {
        int min=Integer.MAX_VALUE;
        for(int i:time){
            min=Math.min(min,i);
        }
        long l=min, r=(long)min*tt;
        while(l<=r){
            long mid=l+(r-l)/2;
            if(isPossible(mid,tt,time))r=mid-1;
            else l=mid+1;
        }
        return l;
    }
    public boolean isPossible(long m, int tt, int[] t){
        long s=0;
        for(int i:t)s+=m/i;
        return (s>=tt)?true:false;
    }
}