class Solution {
    public int[] nextGreaterElements(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int n = arr.length;
        int[] left=new int[arr.length];
        for(int i = 2 * n - 1; i >= 0; i--){
            while(!st.isEmpty()&&arr[st.peek()]<=arr[i%n])st.pop();
            left[i%n]=st.isEmpty()?-1:arr[st.peek()];
            st.push(i%n);
        }
        return left;
    }
}