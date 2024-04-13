class Solution {
    public int myAtoi(String s) {
        
        //removing spaces
        s = s.trim();
        
        //if the string is only spaces that are now removed
        if(s.length() == 0)
        return 0;

        int traverse = 0;
        int sign = 1;
        long num = 0;

        //handling sign
        if((s.charAt(traverse)== '-') || (s.charAt(traverse) == '+'))
        {
            sign = s.charAt(traverse) == '-' ? -1 : 1;
            traverse++;
        }

        //handling digit
        while(traverse < s.length() && Character.isDigit(s.charAt(traverse)))
        {
            int digitFound = s.charAt(traverse) - '0';

            //check for size
            //here we calculate the last possible number for our digit within the range

            if(num > (Integer.MAX_VALUE - digitFound) / 10)
            {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            } 

            num = num * 10 + digitFound;
            traverse++;
        }

        return (int) (sign * num);

    }
}