class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> l=new ArrayList<Integer>();
        for(int i=1;i<nums.length;i+=2){
            for(int j=0;j<nums[i-1];j++) l.add(nums[i]);
        }
        int[] a = new int[l.size()];
        for(int i = 0; i < l.size(); i++){
            a[i] = l.get(i);
        }
        return a;
    }
}