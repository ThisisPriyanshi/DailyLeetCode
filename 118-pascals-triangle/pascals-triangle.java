class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> finalTriangle = new ArrayList<>();

        //adding first row
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        finalTriangle.add(firstRow);

        for(int i = 1; i < numRows; i++)
        {   
            List<Integer> currRow = new ArrayList<>();
            List<Integer> prevRow = finalTriangle.get(i-1);
            //add first element
            currRow.add(1);
            for(int j = 0; j < i-1; j++)
            {
                currRow.add(prevRow.get(j) + prevRow.get(j+1));
            }

            //add last element
            currRow.add(1);

            //add the row to the triangle
            finalTriangle.add(currRow);
        }

        return finalTriangle;
    }
}