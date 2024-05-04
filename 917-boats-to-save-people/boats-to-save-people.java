class Solution {
    public int numRescueBoats(int[] people, int limit) {
                Arrays.sort(people);
        int numBoats = 0;
        int startP = 0;
        int endP = people.length-1;

        while(startP <= endP)
        {
            if(people[startP] + people[endP]  <= limit)
            {
                startP++;
            }

            numBoats++;
            endP--;
        }

        return numBoats;
    }
}