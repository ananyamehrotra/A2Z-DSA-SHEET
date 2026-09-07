class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ll=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> l=new ArrayList<>();
            for(int j=0;j<=i;j++){
                l.add(nCr(i,j));
            }
            ll.add(new ArrayList<>(l));
        }
        return ll;   
    }
    public static int nCr(int n, int r){
        int a=1;
        for(int i=0;i<r;i++){
            a*=(n-i);
            a/=(i+1);
        }
        return a;
    }
}