class Solution {
    public String customSortString(String order, String s) {
        char[] charS = s.toCharArray();
        int position = 0;
        for (int i = 0; i < order.length(); i++)
        {
            for (int j = 0; j < charS.length; j++)
            {
                if (order.charAt(i) == charS[j]) {
                    char temp = charS[position];
                    charS[position] = charS[j];
                    charS[j] = temp;
                    position++;
                }
            }
        }

        String str =  String.valueOf(charS);
        return str;
    }
}