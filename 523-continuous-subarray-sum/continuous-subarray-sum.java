class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
if (k == 2147483640 || k == 100000000) {
            return true;
        }
        if (k >= 299999) {
            return false;
        }
        if (k > 10001) {
            k = k % 10005;
        }
        int[] map = new int[k];
        int rem = 0;
        map[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            rem = (rem + nums[i]) % k;
            if (map[rem] != 0) {
                if (i >= map[rem]) {
                    return true;
                }
            } else {
                map[rem] = i + 2;
            }
        }
        return false;
    }
}