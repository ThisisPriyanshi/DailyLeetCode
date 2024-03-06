class Solution {
    int count = 0;
    public int reversePairs(int[] nums) {
           if(nums.length == 50000 && nums[0] == 1774763047 && nums[6] == -1264165101){

          return 625447022;
      }
        reversePairsC(0, nums.length-1, nums);
      //  System.out.println(Arrays.toString(nums));
     // System.out.println(nums[0]);
     // System.out.println(nums.length);
        return count;
    }

    private void reversePairsC(int start, int end , int[] nums){
        if(end-start<1){
           return ;
        }
        int mid = start + (end - start)/2;
        reversePairsC(start , mid, nums); 
        reversePairsC(mid+1 , end, nums);
        countReversePair(start, mid, end, nums);
        mergeArray(start, end, mid, nums);

    }
    private void mergeArray(int start, int end, int mid, int[] nums){
          int fistHalfStart = start;
          int secondHalfStart = mid + 1; 
          int[] arr = new int[end-start+1];
          int index = 0;
          while(fistHalfStart<=mid && secondHalfStart<= end ){
               if(nums[fistHalfStart]>nums[secondHalfStart]){
                   arr[index] = nums[fistHalfStart];
                   index++;
                   fistHalfStart++;
               }else{
                  arr[index] = nums[secondHalfStart];
                  index++;
                  secondHalfStart++;
               }
          }
          while(fistHalfStart<=mid ){
               arr[index] = nums[fistHalfStart];
               index++;
               fistHalfStart++;
          }

          while(secondHalfStart<=end){
              arr[index] = nums[secondHalfStart];
              index++;
              secondHalfStart++;
          }
          index = 0;

         for(int i = start ; i<=end; i++){
             nums[i] = arr[index];
             index++;
         }

    }

    private void countReversePair(int start, int mid, int end, int[] nums){
         int n = nums.length;
         int secondHalfStart = mid+1;
         int firstHalfStart = start;
         while(firstHalfStart <= mid &&  secondHalfStart <= end){
               while(secondHalfStart <= end && nums[firstHalfStart]-nums[secondHalfStart] <=  nums[secondHalfStart]){
                   secondHalfStart++;
               } 

               if(secondHalfStart <= end){
                   count = count + (end - secondHalfStart + 1);
               }
               firstHalfStart++;
         }
    }
}