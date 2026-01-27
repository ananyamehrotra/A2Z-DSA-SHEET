class Solution {
    public static int largest(int[] arr) {
        // code here
        int n= arr.length;
        int max=arr[0];
            for(int j=0;j<n;j++){
                if(arr[j]>max)
                max=arr[j];
        }
        return max;    
    }
}
