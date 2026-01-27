class Solution {
    public void rotate(int[] a, int k) {
        int n=a.length;
        k=k%n;
        int c=0;
        int[] temp=new int[k];
        for(int i=n-k;i<n;i++){
            temp[c++]=a[i];
        }
        for(int i=n-k-1;i>=0;i--){
            a[k+i]=a[i];
        }
        for(int i=0;i<k;i++){
            a[i]=temp[i];
        }
    }
}