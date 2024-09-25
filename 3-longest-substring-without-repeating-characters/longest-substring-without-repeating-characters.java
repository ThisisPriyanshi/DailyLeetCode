class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> myMap = new HashMap<>();

        int leftP = 0;
        int rightP = 0;
        int maxLen = 0;

        while(rightP < s.length())
        {   
            if(myMap.containsKey(s.charAt(rightP))) //repeated character
            {
                leftP = Math.max((myMap.get(s.charAt(rightP)))+1, leftP);
            }
            myMap.put(s.charAt(rightP), rightP);
            maxLen = Math.max(maxLen, rightP-leftP +1);
            rightP++;
        }

        return maxLen;
    }
}