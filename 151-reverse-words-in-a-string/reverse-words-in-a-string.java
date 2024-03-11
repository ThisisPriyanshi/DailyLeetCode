class Solution {
    public String reverseWords(String s) {
        s = s.trim();
            int n = s.length();
            String word = "";
            String res = "";
            for(int i = (n-1); i>=0; i--)
            {
                char z = s.charAt(i);
                if(z != 32)
                {
                    word = z+word;
                }
                else
                {
                    if(s.charAt(i-1) != 32)
                    {
                        res = res + word + " ";
                        word = "";
                    }

                }
            }

            res = res + word;
            return res;
    }
}