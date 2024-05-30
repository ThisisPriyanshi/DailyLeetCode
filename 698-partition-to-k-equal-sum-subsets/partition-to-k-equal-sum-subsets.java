class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        //found out the sum
        for(int n :nums)
        {
            sum += n;
        }

        //find the target size of buckets, if sum isnt wholly divided by the number of buckets

        if(sum % k != 0)
        {
            return false;
        }

        int targetSize = sum/k;

        //sort the array to make picking easier
        Arrays.sort(nums);

        //create the buckets array
        int[] buckets = new int[k];

        //fill the buckets 
        return fillBuckets(nums, targetSize, nums.length - 1, buckets);

    }

    private boolean fillBuckets(int[] arr, int targetSize, int index, int[] buckets)
    {
        //base statement
        if(index == -1) //we have traversed through all elements
        {
            return true;
        }

        //start filling the buckets
        for(int bucketNum = 0; bucketNum < buckets.length; bucketNum++)
        {
            //check if we can add the index to the target size
            if(buckets[bucketNum] + arr[index] <= targetSize)
            {
                buckets[bucketNum] += arr[index];

                // now move to the next index
                if(fillBuckets(arr, targetSize, index-1, buckets))
                {
                    return true;
                }

                //if it's not true then we can't take this element
                buckets[bucketNum] -= arr[index];
            }

            if(buckets[bucketNum] == 0)// no elements have been picked
            {
                break;
            }

        }

        //either bucjet is empty or we have chisen no elements

        return false;
        
    }
}