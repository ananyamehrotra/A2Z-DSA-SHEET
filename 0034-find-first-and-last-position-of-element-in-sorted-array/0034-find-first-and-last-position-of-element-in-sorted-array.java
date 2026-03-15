class Solution {
    public int[] searchRange(int[] arr, int x) {
        int lb=lowerBound(arr,x);
        int ub=upperBound(arr,x);
        if(lb==arr.length||arr[lb]!=x) return new int[]{-1,-1};
        return new int[]{lb,ub-1};
    }
    public int lowerBound(int[] arr, int x){
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int floorIndex = arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // If the middle element is a potential answer
            if (arr[mid] >= x) {
                floorIndex = mid; 
                high = mid - 1;
            } else {
                low=mid+1;
            }
        }
        return floorIndex;
    }
    public int upperBound(int[] arr, int x){
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ceilIndex = arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > x) {
                ceilIndex = mid;
                high = mid - 1; 
            } else {
                low = mid + 1;
            }
        }
        return ceilIndex;
    }
}