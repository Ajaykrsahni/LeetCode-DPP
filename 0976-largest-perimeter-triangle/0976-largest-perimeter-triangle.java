import java.util.Arrays;
public class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 3; i >= 0; i--) {
            if (nums[i] + nums[i + 1] > nums[i + 2]) {
                return nums[i] + nums[i + 1] + nums[i + 2];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.largestPerimeter(new int[]{2,1,2}));       // Output: 5
        System.out.println(sol.largestPerimeter(new int[]{1,2,1,10}));    // Output: 0
    }
}
