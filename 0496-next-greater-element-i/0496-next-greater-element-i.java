class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] a={-1};
        HashMap<Integer,Integer> h=new HashMap<>();
        Deque<Integer> d=new ArrayDeque<>();
        for(int i:nums2){
            while(!d.isEmpty()&&d.peek()<i){
                h.put(d.pop(),i);
            }
            d.push(i);
        }
        while(!d.isEmpty()){
            h.put(d.pop(),-1);
        }
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = h.get(nums1[i]);
        }
        return ans;
    }
}