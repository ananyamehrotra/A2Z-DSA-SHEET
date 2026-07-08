class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int low=0;
        int high=mat[0].length-1;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            int max=mat[0][mid];
            int r=0;
            for(int i=1;i<mat.length;i++){
                if(max<mat[i][mid]){
                    max=mat[i][mid];
                    r=i;
                }
            }
            int left = (mid == 0) ? -1 : mat[r][mid - 1];
            int right = (mid == mat[0].length - 1) ? -1 : mat[r][mid + 1];
            if(max>left&&max>right)
                return new int[]{r,mid};
            if(max<=right)low=mid+1;
            else high=mid-1;
        }
        return new int[]{-1,-1};
    }
}