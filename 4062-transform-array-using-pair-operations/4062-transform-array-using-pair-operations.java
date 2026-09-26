class Solution {
    public boolean canTransform(int[] source, int[] target) {
        long s=0, t=0;
        for(int i:source)s+=(long)i;
        for(int i:target)t+=(long)i;

        if(s==t)return true;
        return false;
    }
}