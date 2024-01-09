class Solution {
    public int[][] merge(int[][] intervals) {
        List <int[]> myRes = new ArrayList<>();

        if((intervals.length == 0) || (intervals == null))
        {
            return myRes.toArray(new int[0][0]);
        }

        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));


        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int[] i : intervals)
        {
            if(i[0] <= end)
            {
                end = Math.max(end, i[1]);
            }
            else
            {
                myRes.add(new int[] {start, end});
                start = i[0];
                end = i[1];
            }
        }

        myRes.add(new int[] {start, end});
        return myRes.toArray(new int[0][0]);

    }
}