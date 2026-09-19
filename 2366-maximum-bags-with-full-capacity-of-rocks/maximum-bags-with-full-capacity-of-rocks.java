class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] min=new int[capacity.length];
        for(int i=0;i<capacity.length;i++){
            min[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(min);
        int s=0;
        int c=0;
        for(int i:min){
            if(s+i>additionalRocks){
                break;
            }
            s+=i;
            c++;
        }
        return c;
    }
}