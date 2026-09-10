class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int n=x;
        int s=0;
        while(n!=0){
            s+=n%10;
            n/=10;
        }
        if(x%s==0)return s;
        return -1;
    }
}