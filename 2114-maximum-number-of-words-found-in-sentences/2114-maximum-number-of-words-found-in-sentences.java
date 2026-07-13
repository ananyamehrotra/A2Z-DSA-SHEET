class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for (String s : sentences) {
            maxWords = Math.max(maxWords, s.split(" ").length);
        }
        return maxWords;
    }
}