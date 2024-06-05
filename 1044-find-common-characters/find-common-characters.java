class Solution {
    public List<String> commonChars(String[] words) {
        //Arrays.sort(words);

        List<String> str = new ArrayList<String>();

        String myWord = words[0];
        int present = 0;
        for(int i = 0 ; i < myWord.length(); i++)
        {
            char z = myWord.charAt(i);
            for(int j = 1; j < words.length; j++)
            {
                StringBuilder compare = new StringBuilder(words[j]);
                int pos = compare.indexOf(String.valueOf(z));
                if(pos != -1) {
                    compare.setCharAt(pos,'0');
                    words[j]  = String.valueOf(compare);
                    present = 1;
                    continue;
                }
                else
                {
                    present = 0;
                    break;
                }
            }
            if(present == 1)
            str.add(String.valueOf(z));
        }
        return str;
    }
}