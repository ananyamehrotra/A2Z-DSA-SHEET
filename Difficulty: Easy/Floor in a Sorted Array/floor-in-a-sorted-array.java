class Solution {
    public int findFloor(int[] arr, int x) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int floorIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // If the middle element is a potential answer
            if (arr[mid] <= x) {
                floorIndex = mid; // Store this index as a possible answer
                low = mid + 1; // Search in the right half for a better answer
            } else {
                // If the middle element is too large, search in the left half
                high = mid - 1;
            }
        }
        
        return floorIndex;

    }
}
