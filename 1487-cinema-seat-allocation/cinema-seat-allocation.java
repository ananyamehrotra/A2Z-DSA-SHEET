class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer,HashSet<Integer>> map=new HashMap<>();

        for(int[] r:reservedSeats){
            map.putIfAbsent(r[0],new HashSet<>());
            map.get(r[0]).add(r[1]);
        }

        int ans=2*n;

        for(int row:map.keySet()){
            HashSet<Integer> s=map.get(row);

            boolean left=true;
            boolean mid=true;
            boolean right=true;

            for(int i=2;i<=5;i++){
                if(s.contains(i))
                    left=false;
            }

            for(int i=4;i<=7;i++){
                if(s.contains(i))
                    mid=false;
            }

            for(int i=6;i<=9;i++){
                if(s.contains(i))
                    right=false;
            }

            if(left&&right)
                continue;
            else if(left||mid||right)
                ans--;
            else
                ans-=2;
        }

        return ans;
    }
}