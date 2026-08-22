class Solution {
    public long wonderfulSubstrings(String word) {
        int mask=0;
        long[] count = new long[1 << 10];
        long ans=0;
        count[0] = 1;
        char[] chars = word.toCharArray();
        for(char c:chars){
            int idx=c-'a';
            mask^=(1<<idx);
            ans+=count[mask];
            for(int i=0;i<10;i++){
                ans+=count[mask^(1<<i)];
            }
            count[mask]++;
        }
        return ans;
    }
}