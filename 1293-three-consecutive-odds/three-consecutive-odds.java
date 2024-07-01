class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int p1 = 0;
        int p2 = 1;
        int p3 = 2;

        while(p3 < arr.length)
        {
            if( isOdd(arr[p1]) && isOdd(arr[p2]) && isOdd(arr[p3]))
            return true;
        
            p1++;
            p2++;
            p3++;
            
        }

        return false;
    }

    private boolean isOdd(int n)
    {
        if(n%2 == 1)
        return true;

        return false;
    }
}