class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        for(int i:h.keySet()){
            if(h.get(i)>nums.length/3)l.add(i);
            if(l.size()>2)break;
        }
        return l;
    }
}