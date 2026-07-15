class Solution {
    public long subArrayRanges(int[] nums) {
        int n=nums.length;
        int[]ps=new int[n],ns=new int[n],pg=new int[n],ng=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&nums[st.peek()]>nums[i])st.pop();
            ps[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&nums[st.peek()]>=nums[i])st.pop();
            ns[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&nums[st.peek()]<nums[i])st.pop();
            pg[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&nums[st.peek()]<=nums[i])st.pop();
            ng[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        long min=0,max=0;
        for(int i=0;i<n;i++){
            min+=(long)nums[i]*(i-ps[i])*(ns[i]-i);
            max+=(long)nums[i]*(i-pg[i])*(ng[i]-i);
        }
        return max-min;
    }
}