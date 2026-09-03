class Solution {
    public boolean uniformArray(int[] nums) {
        int smallestOdd = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num % 2 == 1)
                smallestOdd = Math.min(smallestOdd, num);
        }
        if (smallestOdd == Integer.MAX_VALUE)
            return true;
        for (int num : nums) {
            if (num % 2 == 0 && num <= smallestOdd)
                return false;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna