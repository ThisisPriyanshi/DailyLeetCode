class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int prod = 1;

        int[] myAns = new int[n];
        Arrays.fill(myAns, 1);

        //left elements product
        for(int i = 0; i < n; i++)
        {
            myAns[i] *= prod;
            prod *= nums[i];
        } 

        //right elements product
        prod = 1;
        for(int i = n-1; i >= 0; i--)
        {
            myAns[i] *= prod;
            prod *= nums[i];
        }

        return myAns;
    }
}