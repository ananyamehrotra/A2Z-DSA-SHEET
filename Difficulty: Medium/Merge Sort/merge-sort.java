class Solution {

    void mergeSort(int a[], int l, int r) {
        if(l<r)
        {
            int mid=(l+r)/2;
            mergeSort(a,l,mid);
            mergeSort(a,mid+1,r);
            merge(l,r,mid,a);
        }
    }
    void merge(int l, int r, int m, int a[]){
        int i=l;
        int j=m+1;
        int k=0;
        int[] temp=new int[r-l+1];
        
        while(i<=m&&j<=r){
            if(a[i]<a[j])temp[k++]=a[i++];
            else temp[k++]=a[j++];
        }
        while(i<=m)temp[k++]=a[i++];
        while(j<=r)temp[k++]=a[j++];
        
        for(int c=0;c<k;c++)a[l+c]=temp[c];
    }
}