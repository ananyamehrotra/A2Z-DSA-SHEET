class Solution {
    public int partitionString(String s) {
        int partitions = 1, seen = 0;

        for (char c : s.toCharArray()) {
            int bit = 1 << (c - 'a');
            if ((seen & bit) != 0) {
                partitions++;
                seen = 0;
            }
            seen |= bit;
        }

        return partitions;
    }
}