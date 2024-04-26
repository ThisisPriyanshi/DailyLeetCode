class Solution {

    String[] keypad = {"0","1","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) 
    {
        List <String> ans = new ArrayList<String>();

        if(digits.equals(""))
        return ans;

        ans = helper(0, new StringBuilder(""), digits, ans);
        return ans;
    }

    private List<String> helper(int index, StringBuilder store, String digits, List<String> finalList)
    {   
        if(store.length() == digits.length())
        {
            finalList.add(String.valueOf(store));
            return finalList;
        }

        int currentDig = digits.charAt(index) - '0'; //converted to digit.

        for(int i = 0; i < keypad[currentDig].length(); i++)
        {
            store.append(keypad[currentDig].charAt(i));
            helper(index+1, store, digits, finalList);
            store.deleteCharAt(store.length()-1);
        }

        return finalList;
    }
}