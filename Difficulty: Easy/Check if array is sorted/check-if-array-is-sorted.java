class Solution {
    public boolean isSorted(int[] a) {
        int c=0;
        int n=a.length;
        for(int i=1;i<n;i++){
            if(a[i]>=a[i-1]){
                continue;
            }
            else c=-1;
        }
        if(c==0){
            return true;
        }
        return false;
    }
}