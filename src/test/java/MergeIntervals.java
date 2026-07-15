 
public class MergeIntervals {
 
	    // Manual sorting using Selection Sort
	    public static void sortIntervals(int[][] intervals) {
	        int n = intervals.length;
	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                if (intervals[j][0] < intervals[minIndex][0]) {
	                    minIndex = j;
	                }
	            }
	            // Swap intervals[i] and intervals[minIndex]
	            int[] temp = intervals[i];
	            intervals[i] = intervals[minIndex];
	            intervals[minIndex] = temp;
	        }
	    }

	    // Function to merge intervals manually
	    public static int[][] merge(int[][] intervals) {
	        sortIntervals(intervals); // Manually sort intervals

	        int[][] result = new int[intervals.length][2]; // Store merged intervals
	        int index = 0; // Index for result array

	        result[index] = intervals[0]; // Start with first interval

	        for (int i = 1; i < intervals.length; i++) {
	            int[] prev = result[index]; // Previous interval
	            int[] curr = intervals[i]; // Current interval

	            if (curr[0] <= prev[1]) { // Overlapping condition
	                prev[1] = (prev[1] > curr[1]) ? prev[1] : curr[1]; // Merge intervals
	            } else {
	                index++;
	                result[index] = curr; // Add non-overlapping interval
	            }
	        }

	        // Copy merged intervals to final array
	        int[][] finalResult = new int[index + 1][2];
	        for (int i = 0; i <= index; i++) {
	            finalResult[i] = result[i];
	        }

	        return finalResult;
	    }

	    // Function to print intervals
	    public static void printIntervals(int[][] intervals) {
	        for (int i = 0; i < intervals.length; i++) {
	            System.out.print("{" + intervals[i][0] + ", " + intervals[i][1] + "} ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
	        int[][] mergedIntervals = merge(intervals);
	        printIntervals(mergedIntervals); // Output: {1, 6} {8, 10} {15, 18}
	    }
	}

