class Solution {
    public void moveZeroes(int[] nums) {
        int n= nums.length;
         int snowBallsize=0;
         for(int i=0 ; i<n ; i++){
             if(nums[i]==0){
                 snowBallsize++;
            }
             else if(snowBallsize>0){
                 int t= nums[i];
                 nums[i]=0;
                 nums[i- snowBallsize]= t;
             }
        }
    }
}