class Solution {
    public int compareVersion(String version1, String version2) {
        //first we use split function to split the strings into different strings based upon "."

        String[] ver1array = version1.split("[.]"); //since "." is a special character we need to put in brackets for itto be recognised as a regex
        String[] ver2array = version2.split("[.]");

        //now we will use for loop to iterate through every substring and perform comparisons by using their ineteger value
        int maxLength = Math.max(ver1array.length, ver2array.length);
        for(int i = 0; i < maxLength; i++)
        {
            int num1 = (i < ver1array.length) ? Integer.valueOf(ver1array[i]) : 0;
            int num2 = (i < ver2array.length) ? Integer.valueOf(ver2array[i]) : 0;

            //if i is within the lengths then pick the integer value if not set it as zero

            if(num1 > num2)
            return 1;
            else if( num1 < num2)
            return -1;
        }

        return 0;
    }
}