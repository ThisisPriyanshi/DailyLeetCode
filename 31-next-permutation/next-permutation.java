class Solution {
    public void nextPermutation(int[] nums) {
       int n = nums.length;
        int index =-1;
        int i=0,j=0,temp=0;
            for( i = n-2; i>=0; i--){
                if(nums[i] < nums[i+1])
                {
                    index=i;
                    break;
                }
            }
            if( index != -1){
                for( i = n-1; i>index; i--){
                    if( nums[i] > nums[index]){
                        temp = nums[i];
                        nums[i] = nums[index];
                        nums[index] = temp;
                        break;
                    }
                }
                i = index+1;
                j = nums.length-1;
                while( i < j ){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                    j--;
                }
            }else{
                i = 0;
                j = nums.length-1;
                while( i < j ){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                    j--;
                }
        }
    }

}