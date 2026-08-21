class Solution {
    public int[] countBits(int n) {
        int[] a=new int[n+1];
        int k=0;
        for(int i=0;i<=n;i++){
            int c=0;
            int j=i;
            while(j!=0){
                c++;
                j=j&(j-1);
            }
            a[k++]=c;
        }
        return a;
    }
}