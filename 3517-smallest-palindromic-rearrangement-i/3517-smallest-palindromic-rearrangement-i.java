class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        char[] half = s.substring(0, n / 2).toCharArray();
        Arrays.sort(half);
        String res =
            new String(half)
            + ((n & 1) == 1 ? s.charAt(n / 2) : "")
            + new StringBuilder(new String(half)).reverse();

        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna