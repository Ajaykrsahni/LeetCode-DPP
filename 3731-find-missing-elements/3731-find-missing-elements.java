class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        int mn = Integer.MAX_VALUE;
        int mx = Integer.MIN_VALUE;

        for (int num : nums) {
            seen.add(num);
            mn = Math.min(mn, num);
            mx = Math.max(mx, num);
        }

        List<Integer> ans = new ArrayList<>();

        for (int x = mn; x <= mx; x++) {
            if (!seen.contains(x)) {
                ans.add(x);
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna