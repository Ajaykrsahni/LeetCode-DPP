class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        for(int i=nums.length-1;i>=2;i--){
            int left=0, right=i-1;
            while(left<right){
                if(nums[left]+nums[right] > nums[i]){
                    c+= right-left;
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return c;
    }
}