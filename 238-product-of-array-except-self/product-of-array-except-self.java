class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;

        //create my array
        int[] myArr = new int[n];
        Arrays.fill(myArr,1);

        //left prdouct 
        int prod = 1;
        for(int i = 0; i < n; i++)
        {
            myArr[i] = myArr[i] * prod;
            prod = prod * nums[i];
        }

        //for right product
        prod = 1;
        for(int j = n-1; j >=0; j--)
        {
            myArr[j] = myArr[j] * prod;
            prod = prod * nums[j];
        }

        return myArr;
    }
}