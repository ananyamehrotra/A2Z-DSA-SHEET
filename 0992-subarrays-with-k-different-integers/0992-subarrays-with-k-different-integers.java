class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,k-1);
            
        }
    int atMost(int[] nums,int k){

    HashMap<Integer,Integer> map = new HashMap<>();

    int i=0;
    int ans=0;
    int distinct=0;

    for(int j=0;j<nums.length;j++){

        map.put(nums[j],map.getOrDefault(nums[j],0)+1);

        if(map.get(nums[j])==1)
            distinct++;

        while(distinct>k){

            map.put(nums[i],map.get(nums[i])-1);

            if(map.get(nums[i])==0)
                distinct--;

            i++;
        }

        ans+=j-i+1;
    }

    return ans;
}
}