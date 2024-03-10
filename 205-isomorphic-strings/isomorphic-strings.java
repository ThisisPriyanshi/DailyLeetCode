class Solution {
    public boolean isIsomorphic(String s, String t) {
        //edge case - lengths are different

        if(s.length() != t.length()) return false;
        
        if(s.equals(t)) return true;

        char[] sChArr = s.toCharArray();
        char[] tChArr = t.toCharArray();
        
        // test cases includes special symbols till ~ see acsii table
        int[] mapS = new int['~' + 1];
        int[] mapT = new int['~' + 1];
        
        for(int i = 0; i < s.length(); i++) {
            
            if(mapS[sChArr[i]] != mapT[tChArr[i]]) {
                return false;
            }
            
            // + 1 we use for exclude i=0 element in the loop due to our map* initializationed with 0 
            mapS[sChArr[i]] = i + 1;
            mapT[tChArr[i]] = i + 1;
        } 
        
        return true;
    }
}