class Solution {
    public boolean search(int[] a, int t) {
        int l=0;
        int r=a.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(a[m]==t)return true;
            if (a[l] == a[m] && a[m] == a[r]) {
                l++;
                r--;
            }
            else if(a[l]<=a[m]){
                if(t<a[m]&&t>=a[l])r=m-1;
                else l=m+1;
            }
            else{
                if(t>a[m]&&t<=a[r])l=m+1;
                else r=m-1;
            }
        }        
        return false;
    }
}