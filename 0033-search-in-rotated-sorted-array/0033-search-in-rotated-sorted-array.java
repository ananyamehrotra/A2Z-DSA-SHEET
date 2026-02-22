class Solution {
    public int search(int[] a, int t) {
        int l=0;
        int r=a.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(a[m]==t)return m;
            if(a[l]<=a[m]){
                if(t<a[m]&&t>=a[l])r=m-1;
                else l=m+1;
            }
            else{
                if(t>a[m]&&t<=a[r])l=m+1;
                else r=m-1;
            }
        }        
        return -1;
    }
}