class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        List<Integer> ls=new ArrayList<>();
        for(int i:nums){
            h.put(i, h.getOrDefault(i, 0) + 1);
        }
        for(int i:h.keySet()){
            if(h.get(i)>nums.length/3)ls.add(i);
            if(ls.size()>2)break;
        }
        return ls;
    }
}