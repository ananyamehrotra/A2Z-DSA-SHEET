class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> greater = new ArrayList<>();

        for(int num:nums){
            if(num < pivot) less.add(num);
            else if(num == pivot) equal.add(num);
            else greater.add(num);
        }
        ArrayList<Integer> result = new ArrayList<>();

        result.addAll(less);
        result.addAll(equal);
        result.addAll(greater);
        int[] ans = new int[result.size()];

        for(int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}