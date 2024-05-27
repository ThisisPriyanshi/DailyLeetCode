class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder myStr = new StringBuilder(s);
        int l = myStr.length();
        int counter = 0;
        do {
            myStr.append(myStr.charAt(0));
            myStr.deleteCharAt(0);
            counter++;

            if(myStr.toString().equals(goal))
                return true;
        }
        while(counter <= s.length());

            return false;
    }
}