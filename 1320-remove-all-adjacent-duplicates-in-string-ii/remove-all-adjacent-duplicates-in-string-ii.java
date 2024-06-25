class Solution {
    public String removeDuplicates(String s, int k) {
        //we will take two stacks, one for storing characters and one for storing no of same adjacent characters.
        Stack<Character> myCharStack = new Stack<>();
        Stack<Integer> myCountStack = new Stack<>();

        for( char ch : s.toCharArray())
        {
            if(!myCharStack.isEmpty() && myCharStack.peek() == ch)
            { //if current character is equal to element on top of character stack we increase count
                myCountStack.push(myCountStack.pop() + 1);
            }
            else
            {   
                //its a new character so we put the character in character stack and update its count
                myCharStack.push(ch);
                myCountStack.push(1);
            }

            //now we check if count = k, if it is we pop it out
            if(myCountStack.peek() == k)
            {
                myCharStack.pop(); //character removed
                myCountStack.pop();// count for character removed
            }
        }

        StringBuilder ans = new StringBuilder(); //for storing the answer

        while(!myCharStack.isEmpty())
        {
            char ch = myCharStack.pop(); //pick out character
            int charCount = myCountStack.pop(); //count of character

            for(int i = 1; i <= charCount; i++)
            {
                ans.insert(0, ch); //add the character "count" times
            }
        }

        return ans.toString(); //return string

    }
}