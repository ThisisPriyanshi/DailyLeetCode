class Solution {
    public String reverseWords(String s) {
        char[] in = s.toCharArray();
        char[] out = new char[in.length + 1];
        int right = in.length - 1;
        int ind = 0;

        while (right >= 0)
        {
            while (right >= 0 && in[right] == ' ') 
            right--;

            if (right < 0) 
            break;

            int rightWordIndex = right;

            while (right >= 0 && in[right] != ' ') 
            right--;
            
            for (int k = right + 1; k <= rightWordIndex; k++ ) 
            out[ind++] = in[k];
            
            out[ind++] = ' ';
        }
        return new String(out, 0, ind - 1);
    }
}