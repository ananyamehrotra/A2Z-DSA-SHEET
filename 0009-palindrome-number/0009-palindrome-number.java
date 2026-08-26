class Solution {
    public boolean isPalindrome(int n) {
        if(n<0)return false;
        int i=0;
        int a=n;
        int rev=0;
        while(a!=0){
            rev=rev*10+a%10;
            a/=10;
        }
        return (rev==n)?true:false;
    }
}