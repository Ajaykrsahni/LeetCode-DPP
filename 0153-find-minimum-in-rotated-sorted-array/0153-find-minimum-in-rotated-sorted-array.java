class Solution {
	public int findMin(int[] nums) {
	    int l=0,h=nums.length-1,m;
	    while(l<=h)
	    {
	        m=l+(h-l)/2;
	        if(l==h)
	        return nums[l];
	        if(nums[l]<=nums[m]&&nums[h]<nums[l])
	        l=m+1;
	        else
	        h=m;
	    }
		return-1;
	}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna