class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int i=0;
        int j=0;
        int max=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        while(j<nums.length){
            h.put(nums[j],h.getOrDefault(nums[j],0)+1);
            while(h.get(nums[j])>k){
                h.put(nums[i],h.get(nums[i])-1);
                i++;
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}