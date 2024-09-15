class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> finalTriangle = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        finalTriangle.add(firstRow);
        for(int i = 2; i <= numRows; i++)
        {
            List<Integer> myRow = new ArrayList<>();
            myRow.add(1); //first element

            int ans = 1;
            for(int col = 1; col < i ; col++)
            {
                ans = ans * (i - col);
                ans = ans / col;

                myRow.add(ans);
            }

            finalTriangle.add(myRow);
        }

        return finalTriangle;
    }

}