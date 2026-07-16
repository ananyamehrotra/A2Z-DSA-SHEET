class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> st = new ArrayDeque<>();
int max = 0;
int n=heights.length;
for (int i = 0; i <= n; i++) {

    int curr = (i == n) ? 0 : heights[i];

    while (!st.isEmpty() && heights[st.peek()] > curr) {

        int h = heights[st.pop()];

        int left = st.isEmpty() ? -1 : st.peek();

        int width = i - left - 1;

        max = Math.max(max, h * width);
    }

    st.push(i);
}
return max;
    }
}