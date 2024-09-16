class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> myIntervals = new ArrayList<>();

        //now we sort our interval array 
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int interval[] : intervals)
        {
            if(interval[0] <= end)
            {
                end = Math.max(end,interval[1]);
            }
            else
            {
                myIntervals.add(new int[]{start, end});
                start = interval[0];
                end = interval[1];
            }
        }

        //adding the last interval
        myIntervals.add(new int[]{start, end});

        //converting it to int[][]
        return myIntervals.toArray(new int[0][0]);
    }
}