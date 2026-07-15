 
public class wordSearch {
	 
	    public static boolean exist(char[][] board, String word) {
	        int rows = board.length, cols = board[0].length;

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                if (search(board, word, i, j, 0)) {
	                    return true;
	                }
	            }
	        }
	        return false;
	    }

	    // Recursive DFS search function
	    private static boolean search(char[][] board, String word, int i, int j, int index) {
	        if (index == word.length()) return true; // Word found
	        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(index)) {
	            return false; // Out of bounds or character mismatch
	        }

	        // Mark current cell as visited by modifying it temporarily
	        char temp = board[i][j];
	        board[i][j] = '#';

	        // Explore all 4 possible directions (up, down, left, right)
	        boolean found = search(board, word, i + 1, j, index + 1) ||
	                        search(board, word, i - 1, j, index + 1) ||
	                        search(board, word, i, j + 1, index + 1) ||
	                        search(board, word, i, j - 1, index + 1);

	        // Restore the cell after exploration
	        board[i][j] = temp;

	        return found;
	    }

	    public static void main(String[] args) {
	        char[][] board = {
	            {'A','B','C','E'},
	            {'S','F','C','S'},
	            {'A','D','E','E'}
	        };
	        String word = "ABCCED";
	        System.out.println(exist(board, word)); // Output: true
	    }
	}
