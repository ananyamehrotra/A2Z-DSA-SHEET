class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int c=0;
        for(int i:arr){
            if(i==target)c++;
        }
        return c;
    }
}
