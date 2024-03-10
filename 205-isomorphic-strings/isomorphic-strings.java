class Solution {
    public boolean isIsomorphic(String s, String t) {
        //edge case - lengths are different

        if(s.length() != t.length())
        {
            return false;
        }

        //create arrays for both to mark the alphabets
        int[] mapForS = new int[256];
        int[] mapForT = new int[256];

        for(int index = 0; index < s.length(); index++)
        {
            //check for differences
            if(mapForS[s.charAt(index)] != mapForT[t.charAt(index)])
            {
                return false;
            }

            mapForS[s.charAt(index)] = index+1;
            mapForT[t.charAt(index)] = index+1;
        }

        return true;
    }
}