class Solution {
    public int fib(int n) {
        if(n == 0)
        return 0;

        if(n == 1)
        return 1;

        int[] myArr = new int[n+1];
        myArr[0] = 0;
        myArr[1] = 1;

        for(int i = 2; i < myArr.length; i++)
        {
            myArr[i] = myArr[i-1] + myArr[i-2];
        }

        return myArr[n];
    }
}