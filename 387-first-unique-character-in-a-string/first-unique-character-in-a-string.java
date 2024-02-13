class Solution {
    public int firstUniqChar(String s) {
        int index = 100000, i;
        
        for(char ch = 'a'; ch<='z'; ch++) {
            i = s.indexOf(ch);
            if(i!=-1 && i == s.lastIndexOf(ch)) {
                index = Math.min(index, i);
            }
        }
        return index==100000?-1:index;
    }

}