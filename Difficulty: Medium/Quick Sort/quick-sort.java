class Solution {
    public void quickSort(int[] a, int left, int right) {
        // code here
        int pivot;
        int i=left;
        int j=right+1;
        if(left<right){
            pivot=a[left];
            do{
                do i++;while(i <= right && a[i]<pivot);
                do j--;while(a[j]>pivot);
                
                if(i<j){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }while(i<j);
            
            int t=a[left];
            a[left]=a[j];
            a[j]=t;
            
            quickSort(a,left,j-1);
            quickSort(a,j+1,right);
        }
    }
}