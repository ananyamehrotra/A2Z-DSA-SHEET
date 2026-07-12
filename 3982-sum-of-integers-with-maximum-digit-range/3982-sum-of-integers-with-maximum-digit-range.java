class Solution {
    public int maxDigitRange(int[] nums) {
        int[] dr=new int[nums.length];
        int k=0;
        for(int n:nums){
            int max=0;
            int min=9;
            int i=n;
            while(i>0){
                max=Math.max(max,i%10);
                min=Math.min(min,i%10);
                i/=10;
            }
            dr[k++]=max-min;
        }
        int max=0;
        for(int i:dr){
            max=Math.max(max,i);
        }
        int s=0;
        for(int i=0;i<dr.length;i++){
            if(dr[i]==max)
                s+=nums[i];
        }
        return s;
    }
}