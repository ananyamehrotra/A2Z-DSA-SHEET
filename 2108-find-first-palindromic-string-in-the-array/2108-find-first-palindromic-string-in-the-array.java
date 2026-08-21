class Solution {
    public String firstPalindrome(String[] words) {
        for (String s : words) {
            int l = 0, r = s.length() - 1;
            boolean palindrome = true;

            while (l < r) {
                if (s.charAt(l) != s.charAt(r)) {
                    palindrome = false;
                    break;
                }
                l++;
                r--;
            }

            if (palindrome)
                return s;
        }

        return "";
    }
}