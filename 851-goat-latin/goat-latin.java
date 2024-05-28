class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder newSentence = new StringBuilder();
        String[] s = sentence.split(" ");

        String vowels = "aeiouAEIOU";

        for(int i = 0; i < s.length; i++)
        {
            char firstChar = s[i].charAt(0);
            int wordCount = i+1;
            if (vowels.indexOf(firstChar) != -1)
            {
                newSentence.append(s[i]).append("ma");
            }
            else
            {
                newSentence.append(s[i].substring(1));
                newSentence.append(firstChar);
                newSentence.append("ma");
            }

            while(wordCount > 0)
            {
                newSentence.append('a');
                wordCount--;
            }

            newSentence.append(" ");

        }
        return newSentence.toString().trim();
    }
}