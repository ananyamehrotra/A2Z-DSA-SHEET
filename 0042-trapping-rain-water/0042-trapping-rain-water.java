class Solution {
    public int trap(int[] height) {
        int i=0;
        int j=height.length-1;
        int lmax=height[0];
        int rmax=height[j];
        int w=0;
        while(i<j){
            if(lmax<=rmax){
                i++;
                lmax=Math.max(lmax,height[i]);
                w+=lmax-height[i];
            }
            else{
                j--;
                rmax=Math.max(rmax,height[j]);
                w+=rmax-height[j];
            }
        }
        return w;
    }
}