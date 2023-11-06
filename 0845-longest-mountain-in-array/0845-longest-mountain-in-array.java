class Solution {
    public int longestMountain(int[] arr) {
        
        if( arr.length < 3)
            return 0;
        
        int N = arr.length;
        int ans = 0;
        int start = 0;
        
        while(start < N)
    {
        int end = start;
        
        //find peak from start
        
        if((end+1 < N) && (arr[end] < arr[end+1]))
           { //set end to peak
               while((end+1 < N) && (arr[end] < arr[end+1]))
                   end++; //loops break when end is at peak
           
        //if end is really peak find the end
        if((end+1 < N) && (arr[end] > arr[end+1]))
           {
               while((end+1 < N) && (arr[end] > arr[end+1]))
                   end++;
            
            ans = Math.max(ans, end-start +1);
           }
        }
           
           //set start again for new sub mountain array
           
           start = Math.max(end, start+1);   
    }
           
           return ans;
}
           }