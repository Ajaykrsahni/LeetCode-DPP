class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int ans = 0;
        for (int l = 0; l < n; l++) {
            int targetCount = 0;
            for (int r = l; r < n; r++) {
                if (nums[r] == target) {
                    targetCount++;
                }
                int len = r - l + 1;
                if (targetCount > len / 2) {
                    ans++;
                }
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna