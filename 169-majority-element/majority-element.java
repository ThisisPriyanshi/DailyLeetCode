class Solution {
    public int majorityElement(int[] nums) {
int BoyerMooreElement = 0;
        int BoyerMooreCounter = 0;

        for(int i = 0 ; i < nums.length; i++)
        {
            if( BoyerMooreCounter == 0)
            {
                BoyerMooreElement = nums[i];
            }

            if ( nums[i] == BoyerMooreElement)
            {
                BoyerMooreCounter++;
            }
            else
            {
                BoyerMooreCounter--;
            }
        }

        return BoyerMooreElement;
    }
}