class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> myFactors = new ArrayList<>();
        for (int i = 1; i<= n; i++)
        {
            if (n % i == 0)
            {
                myFactors.add(i);
            }
        }

        int factors = myFactors.size();
        return k <= factors ? myFactors.get(k-1) : -1;
    }
}