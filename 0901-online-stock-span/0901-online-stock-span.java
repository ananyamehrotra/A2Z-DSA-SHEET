class StockSpanner {
    Deque<int[]> d;
    
    public StockSpanner() {
       d=new ArrayDeque<>();
    }
    
    public int next(int price) {
        int s=1;
        while(!d.isEmpty()&&d.peek()[0]<=price)s+=d.pop()[1];
        d.push(new int[]{price,s});
        return s;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */