class Solution {
    public boolean validPalindrome(String s) {
return isPalindrome(0, s.length() - 1, s, false);
    }

    private boolean isPalindrome(int i, int j, String s, boolean deleted) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                if (deleted) {
                    return false;
                }

                return isPalindrome(i + 1, j, s, true) || isPalindrome(i, j-1, s, true);
            }

            i++;
            j--;
        }

        return true;
    }
}