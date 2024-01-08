class Solution {

    String[] keypad = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        
        List<String> ans = new ArrayList<String>();
        if( digits.equals(""))
        {
            return ans;
        }

        ans = helper(0, new StringBuilder(""),digits, ans);
        return ans;
    }

    public List<String> helper(int index, StringBuilder s, String digits, List<String> ans)
    {
        if(s.length() == digits.length())
        {
            ans.add(String.valueOf(s));
            return ans;
        }

        int currentDigit = digits.charAt(index) - '0';
        for(int i = 0; i < keypad[currentDigit].length(); i++)
        {
            s.append(keypad[currentDigit].charAt(i));
            helper(index+1, s, digits, ans);
            s.deleteCharAt(s.length()-1);
        }

        return ans;
    } 
}