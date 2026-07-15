
public class LongestIncreasingSubsequence {
	 
	    public static int lengthOfLIS(int[] nums) {
	        int n = nums.length;
	        int[] dp = new int[n]; // Store LIS for each index

	        // Step 1: Initialize dp array (each element is at least LIS of length 1)
	        for (int i = 0; i < n; i++) {
	            dp[i] = 1;
	        }

	        // Step 2: Compute LIS using DP
	        for (int i = 1; i < n; i++) {
	            for (int j = 0; j < i; j++) {
	                if (nums[i] > nums[j] && dp[i] < dp[j] + 1) {
	                    dp[i] = dp[j] + 1; // Update LIS at index i
	                }
	            }
	        }

	        // Step 3: Find max LIS in dp array manually
	        int maxLIS = 0;
	        for (int i = 0; i < n; i++) {
	            if (dp[i] > maxLIS) {
	                maxLIS = dp[i];
	            }
	        }

	        return maxLIS;
	    }

	    public static void main(String[] args) {
	        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
	        System.out.println(lengthOfLIS(nums)); // Output: 4
	    }
	}

