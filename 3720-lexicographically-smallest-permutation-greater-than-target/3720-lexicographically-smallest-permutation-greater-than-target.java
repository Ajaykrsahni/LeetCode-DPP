class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int[] count = new int[26];
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }
        int n = s.length();
        int matched = 0;
        while (matched < n && count[target.charAt(matched) - 'a'] > 0) {
            count[target.charAt(matched) - 'a']--;
            matched++;
        }
        int start = matched < n ? matched : n - 1;
        for (int i = start; i >= 0; i--) {
            if (i < matched) {
                count[target.charAt(i) - 'a']++;
            }
            int bigger = -1;
            for (int ch = target.charAt(i) - 'a' + 1; ch < 26; ch++) {
                if (count[ch] > 0) {
                    bigger = ch;
                    break;
                }
            }
            if (bigger != -1) {
                count[bigger]--;
                StringBuilder answer = new StringBuilder(target.substring(0, i));
                answer.append((char) ('a' + bigger));
                for (int ch = 0; ch < 26; ch++) {
                    while (count[ch]-- > 0) {
                        answer.append((char) ('a' + ch));
                    }
                }
                return answer.toString();
            }
        }
        return "";
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna