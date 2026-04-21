class StockSpanner {
    int ind=-1;
    int ans=0;
    Stack <int[]> st= new Stack<>();
    public StockSpanner() {
         int ind=-1;
         st= new Stack<>();
    }
    
    public int next(int price) {
        ind+=1;
        while(!st.isEmpty() && st.peek()[0]<=price){
            st.pop();
        }
        if(st.isEmpty()){
            ans=ind+1;
        }
        else{
            ans= ind - st.peek()[1];
        }
        st.push(new int[]{price,ind});
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */