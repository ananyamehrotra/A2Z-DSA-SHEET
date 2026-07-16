class Solution {
    public int maximalRectangle(char[][] matrix) {
        int[] h=new int[matrix[0].length];
        
        int max=0;

        for(char[] a:matrix){
            for(int j=0;j<a.length;j++){
                if(a[j]=='1')h[j]++;
                else h[j]=0;
            }
        
        Deque<Integer> d=new ArrayDeque<>();

        for(int i=0;i<=h.length;i++){
            int curr=(i==h.length)?0:h[i];
            while(!d.isEmpty()&&h[d.peek()]>curr){
                int height=h[d.pop()];
                int left=d.isEmpty()?-1:d.peek();
                int w=i-left-1;
                max=Math.max(max,height*w);
            }
            d.push(i);
        }}
        return max;
    }
}