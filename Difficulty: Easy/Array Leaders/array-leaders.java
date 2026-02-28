class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n=arr.length;
        int max =arr[n-1];
        ArrayList<Integer> l=new ArrayList<Integer>();
        l.add(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                l.add(arr[i]);
            }
        }
        Collections.reverse(l);
        return l;
    }
}
