class Solution {
    public int majorityElement(int[] nums) {
        //using boyer moore algorithm

        int boyerMCounter = 0;
        int boyerElement = 0;

        for(int i = 0; i< nums.length; i++)
        {
            if( boyerMCounter == 0)
            {
                boyerElement = nums[i];
            }

            if( nums[i] == boyerElement)
            {
                boyerMCounter++;
            }
            else
            {
                boyerMCounter--;
            }
        }

        return boyerElement;
    }
}