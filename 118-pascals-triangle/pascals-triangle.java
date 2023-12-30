class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> myResult = new ArrayList<>();

        //edge case
        if(numRows == 0)
        return myResult;

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        myResult.add(firstRow);

        if(numRows == 1)
        return myResult;

        //more than 1 row
        for(int i = 1; i < numRows; i++)
        {
            List<Integer> prevRow = myResult.get(i-1);
            //start the new row 
            List<Integer> row = new ArrayList<>();
            row.add(1); //first element
            for(int j = 0; j < i-1; j++)
            {
                row.add(prevRow.get(j) + prevRow.get(j+1));
            }
            row.add(1); //last element
            myResult.add(row);
        }

        return myResult;
    }
}