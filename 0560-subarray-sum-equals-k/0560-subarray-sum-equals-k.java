class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> m=new HashMap<>();
        m.put(0,1);
        int s=0, c=0, r=0;
        for(int i=0;i<n;i++){
            s+=nums[i];
            r=s-k;
            if(m.containsKey(r)){
                c+=m.get(r);
            }
            if(m.containsKey(s)){
                m.put(s, m.get(s) + 1);
            }
            else{
                m.put(s, 1);
            }
        }
        return c;
    }
}