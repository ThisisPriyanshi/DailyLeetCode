class Solution {
    public int[][] merge(int[][] intervals) {

        List<int[]> result = new ArrayList<>();
        
        //sorting the intervals array by the row position

        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0], b[0]));

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i[] : intervals)
        {
            if( i[0] <= end)
            {
                end = Math.max(i[1], end);
            }
            else
            {
                result.add(new int[]{start, end});
                start = i[0];
                end = i[1];
            }
        }

        //add the last interval
        result.add(new int[]{start, end});
        return result.toArray(new int[0][0]);
    }
}