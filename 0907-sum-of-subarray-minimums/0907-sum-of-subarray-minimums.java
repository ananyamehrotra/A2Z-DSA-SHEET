class Solution {
    public int sumSubarrayMins(int[] arr) {
        Stack<Integer> st=new Stack<>();
        long mod = 1_000_000_007;
        int n=arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty()&&arr[st.peek()]>arr[i])st.pop();
            left[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty()&&arr[st.peek()]>=arr[i])st.pop();
            right[i]=st.isEmpty()?arr.length:st.peek();
            st.push(i);
        }
        long sum=0;
        for(int i=0;i<arr.length;i++){
            long count=(long)(i-left[i])*(right[i]-i);
            sum=(sum+arr[i]*count)%mod;
        }
        return (int)sum;
    }
}