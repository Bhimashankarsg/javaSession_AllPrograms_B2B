 

public class CandyDistribution {
	 
	    public static int minCandies(int[] ratings) {
	        int n = ratings.length;
	        int[] candies = new int[n];

	        // Step 1: Give each child at least 1 candy
	        for (int i = 0; i < n; i++) {
	            candies[i] = 1;
	        }

	        // Step 2: Left to Right - Ensure increasing ratings get more candies
	        for (int i = 1; i < n; i++) {
	            if (ratings[i] > ratings[i - 1]) {
	                candies[i] = candies[i - 1] + 1;
	            }
	        }

	        // Step 3: Right to Left - Ensure decreasing ratings get correct candies
	        for (int i = n - 2; i >= 0; i--) {
	            if (ratings[i] > ratings[i + 1] && candies[i] <= candies[i + 1]) {
	                candies[i] = candies[i + 1] + 1;
	            }
	        }

	        // Step 4: Sum the candies manually
	        int totalCandies = 0;
	        for (int i = 0; i < n; i++) {
	            totalCandies += candies[i];
	        }

	        return totalCandies;
	    }

	    public static void main(String[] args) {
	        int[] ratings = {1, 0, 2};
	        System.out.println(minCandies(ratings)); // Output: 5
	    }
	}

