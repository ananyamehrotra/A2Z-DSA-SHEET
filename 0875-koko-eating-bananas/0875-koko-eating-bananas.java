class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        Arrays.sort(piles);
        int high=piles[piles.length-1];
        int min=1;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(possible(mid,piles,h)){
                min=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return min;
    }
    public boolean possible(int s,int[] piles,int h){
        long hours=0;
        for(int i =0;i<piles.length;i++){
            hours+=Math.ceil((double)piles[i]/s);
        }
        if(hours>h)return false;
        return true;
    }
}