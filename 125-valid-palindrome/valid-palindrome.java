class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]","");

        return isPalindrome(s, 0, s.length()-1);
    }

    private boolean isPalindrome(String str, int startP, int endP)
    {
        //base statement
        if(startP >= endP)
        return true;

        char s = str.charAt(startP);
        char e = str.charAt(endP);

        if(s != e)
        return false;
        
        return isPalindrome(str, startP+1, endP-1);
    }
}