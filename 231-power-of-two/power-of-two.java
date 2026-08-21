class Solution {
    public boolean isPowerOfTwo(int n) {
        int c=0;
        if(n<0)return false;
        while(n!=0){
            c++;
            n=n&(n-1);
        }
        return (c==1)?true:false;
    }
}