 
public class MaxProductSubarray {
	 
	    public static int maxProduct(int[] nums) {
	        int n = nums.length;
	        int maxProduct = nums[0]; // Store maximum product found
	        int currMax = nums[0]; // Track current maximum product
	        int currMin = nums[0]; // Track current minimum product

	        for (int i = 1; i < n; i++) {
	            int tempMax = currMax; // Store previous max value before updating

	            // Update max and min product
	            currMax = (nums[i] > nums[i] * currMax) ? nums[i] : nums[i] * currMax;
	            currMax = (currMax > nums[i] * currMin) ? currMax : nums[i] * currMin;

	            currMin = (nums[i] < nums[i] * tempMax) ? nums[i] : nums[i] * tempMax;
	            currMin = (currMin < nums[i] * currMin) ? currMin : nums[i] * currMin;

	            // Update max product
	            maxProduct = (maxProduct > currMax) ? maxProduct : currMax;
	        }

	        return maxProduct;
	    }

	    public static void main(String[] args) {
	        int[] nums = {2, 3, -2, 4};
	        System.out.println(maxProduct(nums)); // Output: 6
	    }
	}

