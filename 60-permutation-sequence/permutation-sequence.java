class Solution {
    public String getPermutation(int n, int k) {
        int blockSize = 1;
        ArrayList<Integer> myList = new ArrayList<>();
        for(int i = 1 ; i < n; i++)
        {
            blockSize *= i;
            myList.add(i);
        }

        myList.add(n); 
        String ans = "";
        k = k-1; 

        while(true)
        {
        ans = ans + myList.get(k / blockSize);
        myList.remove(k / blockSize);

        if(myList.size() == 0)
        break;

        k = k % blockSize;
        blockSize = blockSize/ myList.size();
        }

         return ans;
    }
}