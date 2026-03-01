class Solution {
    public void rotate(int[][] m) {
        int n=m.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=temp;
            }
        }
        
        for(int i=0;i<n;i++){
            int start=0, end=n-1;
            while(start<end){
                int temp=m[i][start];
                m[i][start++]=m[i][end];
                m[i][end--]=temp;
            }
        }
    }
}