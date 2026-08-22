class Solution {
    public boolean checkDivisibility(int n) {
        int s=0;
        int p=1;
        int a=n;
        while(n>0){
            int d=n%10;
            s+=d;
            p*=d;
            n/=10;
        }
        return (a%(p+s)==0);
    }
}