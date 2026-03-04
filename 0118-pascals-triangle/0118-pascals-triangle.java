class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l=new ArrayList<List<Integer>>();
        int f=1;
        for(int i=0;i<numRows;i++){
            List<Integer> ll=new ArrayList<>();
            for(int j=0;j<=i;j++){
                ll.add(nCr(i,j));
            }
            l.add(new ArrayList<>(ll));
        }
        return l;
    }
    int nCr(int n, int r) {
        int res = 1;

        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }
}