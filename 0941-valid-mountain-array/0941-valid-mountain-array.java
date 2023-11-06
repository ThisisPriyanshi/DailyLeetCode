class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3)
            return false;
        
        //using two pointers
        
        int increasePointer = 0;
        int decreasePointer = arr.length-1;
        
        while((increasePointer+1 < arr.length-1) && (arr[increasePointer] < arr[increasePointer+1]))
            increasePointer++;
        
        while((decreasePointer-1 > 0) && (arr[decreasePointer] < arr[decreasePointer-1]))
            decreasePointer--;
        
        return increasePointer==decreasePointer;
    }
}