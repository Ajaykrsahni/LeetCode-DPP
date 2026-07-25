class Solution {
    public int maxProduct(int n) {
        int max1 = -1 , max2 = -1;
        while(n != 0){
            int rem = n % 10;
            if(max1 <= rem){
                max2 = max1;
                max1 = rem;
            }
            else if(max2 < rem){
                max2 = rem;
            }
            n /= 10;
        }
        return max1 * max2;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna