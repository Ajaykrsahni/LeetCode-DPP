class Solution {
    int count = 0;
    public int averageOfSubtree(TreeNode root) {
        trav(root);
        return count;
    }
    private int[] trav(TreeNode root) {
        if (root == null) return new int[]{0, 0};
        int[] left = trav(root.left);
        int[] right = trav(root.right);
        int subtreeSum = left[0] + right[0] + root.val;
        int subtreeCount = left[1] + right[1] + 1;
        if (subtreeSum / subtreeCount == root.val)
            count++;
        return new int[]{subtreeSum, subtreeCount};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna