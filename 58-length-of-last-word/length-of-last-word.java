class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();

        int l = s.length();
        int count = 0;
        for(int i = s.lastIndexOf(" ")+1; i <l ; i++)
        {
            count++;
        }

        return count;
    }
}