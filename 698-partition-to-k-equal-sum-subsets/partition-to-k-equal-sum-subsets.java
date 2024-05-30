class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        //we find the sum of all elements and then divide it by k to find each buckets value
        for(int n : nums)
        {
            sum += n;
        }

        if( sum % k != 0) // if sum is not wholly divisible by k then return false
        {
            return false;
        }

        //now we sort the array so we can pick up elements
        Arrays.sort(nums);

        //find each bucket value
        int target = sum/k;

        //create bucket array
        int[] buckets = new int[k];

        //now we fill buckets
        return fillBucket(nums, target, nums.length-1, buckets);
    }

    private boolean fillBucket(int[] arr, int target, int index, int[] bucket)
    {
        //if we have taken all elements 
        if(index == -1)
        {
            return true;
        }

        //start filling the bucket
        for(int j = 0; j < bucket.length; j++)
        {
            //check if bucket is full
            if(bucket[j]+ arr[index] <= target)
            {
                bucket[j] += arr[index];

            //call recursion for next element
            if(fillBucket(arr, target, index-1, bucket))
            {
                return true;
            }

            //we can't tke this lement so we skip
            bucket[j] -= arr[index];
            }

            if(bucket[j] == 0) //bucket is empty --> no element has been chosen
            {
                break;
            }

        }

        //either bucket is empty which is invalid 
        //or we have filled our buckets but there are still elements left which is also invalid

        return false;
    }
}