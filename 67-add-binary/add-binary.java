class Solution {
    public String addBinary(String a, String b) {
        
        StringBuilder res = new StringBuilder();

        int len1 = a.length() - 1;
        int len2 = b.length() - 1;
        int carry = 0;

        while((len1 >= 0) || (len2 >= 0))
        {   
            int sum = carry;

            if(len1 >= 0)
            sum += a.charAt(len1--) - '0';

            if(len2 >= 0)
            sum += b.charAt(len2--) - '0';

            carry = sum > 1 ? 1 : 0;
            res.append(sum%2);
        }

        if(carry != 0)
            res.append(carry);

            return res.reverse().toString();
    }
}