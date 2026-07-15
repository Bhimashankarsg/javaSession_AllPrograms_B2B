 
public class Search2DMatrix {
 
	    public static boolean searchMatrix(int[][] matrix, int target) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;
	        int left = 0, right = rows * cols - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            int midValue = matrix[mid / cols][mid % cols]; // Convert 1D index to 2D

	            if (midValue == target) return true; // Target found
	            else if (midValue < target) left = mid + 1; // Search right
	            else right = mid - 1; // Search left
	        }

	        return false; // Not found
	    }

	    public static void main(String[] args) {
	        int[][] matrix = {
	            {1, 3, 5, 7},
	            {10, 11, 16, 20},
	            {23, 30, 34, 60}
	        };
	        
	        int target = 34;
	        
	        System.out.println(searchMatrix(matrix, target)); // Output: true
	    }
	}
