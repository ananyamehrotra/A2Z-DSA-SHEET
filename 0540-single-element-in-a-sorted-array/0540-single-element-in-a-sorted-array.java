class Solution {
    public int singleNonDuplicate(int[] a) {
        int low=0;
        int high=a.length-1;

        while(low<high){
            int mid=low+(high-low)/2;

            if(a[mid]==a[mid^1])low=mid+1;
            else high=mid;
        }
        return a[low];
    }
}