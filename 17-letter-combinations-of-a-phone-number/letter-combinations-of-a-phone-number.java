class Solution {
    //declared keypad
    String[] keypad = {"0","1","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        if (digits.length() == 0)
        return ans;

        helper(0, new StringBuilder(""), digits, ans);

        return ans;
    }

    private void helper(int index, StringBuilder sb, String digits, List<String> result)
    {
        //base condition - if the length of the string builder is equal to the length of the digits we have reached the end of the commbination

        if(sb.length() == digits.length())
        {
            result.add(String.valueOf(sb));
            return;
        }

        int currDig = digits.charAt(index) - '0';

        for(int i = 0; i < keypad[currDig].length(); i++)
        {   
            //pick
            sb.append(keypad[currDig].charAt(i));
            //call recursion
            helper(index+1, sb, digits, result);
            //backtrack
            sb.deleteCharAt(sb.length()-1);

        }

        
    }
}