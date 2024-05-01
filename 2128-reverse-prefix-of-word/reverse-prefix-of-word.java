class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        StringBuilder rev = new StringBuilder(word.substring(0,index+1));
        rev.reverse();

        String result = rev.toString()+word.substring(index+1);
        return result;
    }
}