class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int i = 0;
        int n = arr.length;
        
        if(n < 3)
            return 0;
            
        while( i+1 < n && arr[i] < arr[i+1])
            i++;
        
        return i;
    }
}