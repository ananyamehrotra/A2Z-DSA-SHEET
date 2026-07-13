class Solution {
    public int trap(int[] height) {
        int i=0;
        int j=height.length-1;
        int lmax=height[0];
        int rmax=height[j];
        int w=0;
        while(i<j){
            lmax = Math.max(lmax, height[i]);
            rmax = Math.max(rmax, height[j]);
            if(lmax<=rmax){
                w+=lmax-height[i];
                i++;
            }
            else{
                w+=rmax-height[j];
                j--;
            }
        }
        return w;
    }
}