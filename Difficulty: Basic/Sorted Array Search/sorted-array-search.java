class Solution {
    static boolean searchInSorted(int a[], int k) {
        for(int i:a){
            if(i==k){
                return true;
            }
        }
        return false;
    }
}