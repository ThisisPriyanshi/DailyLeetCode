class Solution {
    public String largestOddNumber(String num) {
        
        //edge case - number is odd
        if((int)num.charAt(num.length()-1)%2 == 1)
        {
            return num;
        }

        int i = num.length()-1;
        while(i >= 0)
        {
             if((int)num.charAt(i)%2 == 1)
             {
                 return num.substring(0,i+1);
             }

             i--;
        }
        return "";
    }
}