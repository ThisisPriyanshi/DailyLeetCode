class Solution {
    public int maxProduct(int[] nums) {
         int n = nums.length;

        int maxProduct = Integer.MIN_VALUE;

        //applying Kadane's algo from Left to Right
        
        int currProd_Left_to_Right = 1;

        for(int i=0; i<n; i++){
            currProd_Left_to_Right*=nums[i];

            maxProduct = Math.max(maxProduct, currProd_Left_to_Right);
            
             if(currProd_Left_to_Right == 0){
                currProd_Left_to_Right = 1;
            }

        }

        //applying Kadane's algo from Right to Left

        int currProd_Right_to_Left = 1;

        for(int i=n-1; i>=0; i--){
            currProd_Right_to_Left*=nums[i];
            
            maxProduct = Math.max(maxProduct, currProd_Right_to_Left);
            
            if(currProd_Right_to_Left == 0){
                currProd_Right_to_Left = 1;
            }

        }

        return maxProduct;
    }
}