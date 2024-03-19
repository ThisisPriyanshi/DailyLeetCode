class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freqs = new int[26]; // array to keep track of the frequency of each task which is A-Z, so only 26 values
        for(char c : tasks){
            freqs[c - 'A']++;
        }
        int maxFreq = 0; // the maximum frequncy at which any value appears
        int numMaxValues = 0; // the number of values that appear at maxfreq

        for(int i : freqs){
            if(i > maxFreq){
                maxFreq = i;
                numMaxValues = 1;
            }
            else if( i == maxFreq)
                numMaxValues++;
        }

        int intervals = (maxFreq - 1) * (n + 1) + numMaxValues;
        return Math.max(intervals, tasks.length);
    }
}