 
public class ZigzagWithoutInbuilt {
 
	    public static String convertToZigzag(String s, int numRows) {
	        if (numRows == 1) return s; // Edge case

	        int len = s.length();
	        char[][] matrix = new char[numRows][len]; // 2D Array for Zigzag
	        char[] result = new char[len]; // To store final result
	        int row = 0, col = 0, step = 1; // step controls direction
	        int resultIndex = 0; // To fill result array

	        // Fill the zigzag matrix
	        for (int i = 0; i < len; i++) {
	            matrix[row][col] = s.charAt(i);

	            // Change direction at top and bottom
	            if (row == 0) step = 1;
	            if (row == numRows - 1) step = -1;

	            row += step; // Move up or down
	            if (step == -1) col++; // Move right only when moving up
	        }

	        // Read the matrix row-wise to form the result
	        for (int i = 0; i < numRows; i++) {
	            for (int j = 0; j < len; j++) {
	                if (matrix[i][j] != '\u0000') { // Ignore empty spaces
	                    result[resultIndex++] = matrix[i][j];
	                }
	            }
	        }

	        // Convert char array to string manually
	        String finalResult = "";
	        for (int i = 0; i < resultIndex; i++) {
	            finalResult += result[i];
	        }

	        return finalResult;
	    }

	    public static void main(String[] args) {
	        String input = "PAYPALISHIRING";
	        int numRows = 3;
	        System.out.println(convertToZigzag(input, numRows));
	    }
	}
