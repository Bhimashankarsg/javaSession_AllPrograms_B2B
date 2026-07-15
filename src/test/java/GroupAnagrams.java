
public class GroupAnagrams {
	 
	    // Function to manually sort a string (Bubble Sort)
	    public static String manualSort(String str) {
	        char[] arr = str.toCharArray();
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) { // Swap if out of order
	                    char temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }

	        // Convert char array back to string manually
	        String sortedStr = "";
	        for (int i = 0; i < n; i++) {
	            sortedStr += arr[i];
	        }
	        return sortedStr;
	    }

	    // Function to group anagrams manually
	    public static void groupAnagrams(String[] words) {
	        int len = words.length;
	        boolean[] visited = new boolean[len]; // Track visited words

	        for (int i = 0; i < len; i++) {
	            if (visited[i]) continue; // Skip if already grouped

	            // Print group header
	            System.out.print("Group: ");

	            String sortedWord1 = manualSort(words[i]);
	            for (int j = i; j < len; j++) {
	                String sortedWord2 = manualSort(words[j]);

	                if (sortedWord1.equals(sortedWord2)) { // Check if anagrams
	                    System.out.print(words[j] + " ");
	                    visited[j] = true; // Mark as visited
	                }
	            }
	            System.out.println(); // New line for next group
	        }
	    }

	    public static void main(String[] args) {
	        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
	        groupAnagrams(words);
	    }
	}

