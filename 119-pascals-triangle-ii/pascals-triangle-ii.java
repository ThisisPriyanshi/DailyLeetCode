class Solution {
    public List<Integer> getRow(int rowIndex) {
        //since it is zero indexed we increase the row number by 1
        List<Integer> myRow = new ArrayList<>();
        myRow.add(1); //first element
        rowIndex++;
        long ans = 1;
        for(int col = 1; col < rowIndex; col++)
        {
            ans = ans * (rowIndex-col);
            ans = ans / col;

            myRow.add((int)ans);
        }

        return myRow;

    }
}