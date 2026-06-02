class Solution {
    private int calFinishTime(int[] ls, int[] ld,int[] ws, int[] wd) {
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < ls.length; i++) {
            mini = Math.min(mini, ls[i] + ld[i]);
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < ws.length; i++) {
            ans = Math.min(
                ans,
                Math.max(mini, ws[i]) + wd[i]
            );
        }
        return ans;
    }
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        return Math.min(
            calFinishTime(landStartTime,landDuration,waterStartTime,waterDuration),
            calFinishTime(waterStartTime,waterDuration,landStartTime,landDuration)
        );
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna