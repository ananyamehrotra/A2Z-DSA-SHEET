class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i = 1;
        int j = 0;
        int c = 0;

        while (true) {
            if (j < arr.length && arr[j] == i) {j++;
            } else {
                c++;
                if (c == k) return i;
            }
            i++;
        }
    }
}