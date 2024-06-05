class Solution {
    public List<String> commonChars(String[] words) {
    List<String> str = new ArrayList<String>();

        int[] countChar = count(words[0]);

        for(int i = 1; i < words.length; i++)
        {
            countChar = compare(countChar, count(words[i]));
        }

        //we have frequency of all common characters in all strings
        for(int i = 0; i < 26; i++)
        {
            if(countChar[i] != 0)
            {
                char ch = (char) ('a' + i);
                while(countChar[i]>0)
                {
                    str.add(String.valueOf(ch));
                    countChar[i]--;
                }
            }
        }


        return str;
    }

    private static int[] compare(int[] count1, int[] count2)
    {
        int[] minCount = new int[26];
        for(int i = 0; i < 26; i++)
        minCount[i] = Math.min(count1[i], count2[i]);

        return minCount;
    }

    public static int[] count(String str)
    {
        int[] countArr = new int[26];
        for(char c : str.toCharArray())
        {
            countArr[c - 'a']++;
        }

        return countArr;
    }

}