class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int h = g.length; // Length of greed array
        int m = s.length; // Length of size array
        int l = 0, r = 0; // Pointers for greed and size arrays

        Arrays.sort(g); // Sort the greed factors
        Arrays.sort(s); // Sort the cookie sizes

        // Loop through cookies and children
        while (l < m && r < h) {  // Corrected: Check both l < m and r < h
            if (g[r] <= s[l]) { // If the current cookie can satisfy the current child's greed
                r++; // Move to the next child
            }
            l++; // Move to the next cookie
        }

        return r; // Return the number of content children
    }
}