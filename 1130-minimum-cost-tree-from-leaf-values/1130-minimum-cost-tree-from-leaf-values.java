class Solution {
    public int mctFromLeafValues(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(Integer.MAX_VALUE);
        int cost = 0;

        for (int val : arr) {
            while (stack.peek() <= val) {
                int mid = stack.pop();
                cost += mid * Math.min(stack.peek(), val);
            }
            stack.push(val);
        }

        while (stack.size() > 2) {
            int top = stack.pop();
            cost += top * stack.peek();
        }

        return cost;
    }
}