class Solution {
    public int findKthNumber(int m, int n, int k) {
        int low = 1;
    int high = m * n;

    while (low <= high) {

        int mid = low + (high - low) / 2;

        if (countLessEqual(mid, m, n) >= k) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }

    return low;
}

private int countLessEqual(int mid, int m, int n) {

    int count = 0;

    for (int row = 1; row <= m; row++) {
        count += Math.min(mid / row, n);
    }

    return count;
    }
}