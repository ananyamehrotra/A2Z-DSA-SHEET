class Solution {
    public boolean threeFibonacciSum(int n) {
        if(n%2!=0)return false;
        long x=n/2;
        
        return isPerfectSquare(5*x*x+4)||isPerfectSquare(5*x*x-4);
    }
    public boolean isPerfectSquare(long num) {
    long sqrt = (long) Math.sqrt(num);
    return sqrt * sqrt == num;
}
}