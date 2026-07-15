
public class LongestSubstring {
 
	    public static int lengthOfLongestSubstring(String s) {
	        int[] charCount = new int[128]; // ASCII character count array
	        int left = 0, right = 0, maxLength = 0, n = s.length();

	        while (right < n) {
	            char rightChar = s.charAt(right);
	            charCount[rightChar]++; // Increase character count

	            // If a duplicate character is found, shrink the window
	            while (charCount[rightChar] > 1) {
	                char leftChar = s.charAt(left);
	                charCount[leftChar]--; // Remove from window
	                left++;
	            }

	            // Update maxLength
	            int currentLength = right - left + 1;
	            if (currentLength > maxLength) {
	                maxLength = currentLength;
	            }

	            right++; // Expand window
	        }

	        return maxLength;
	    }

	    public static void main(String[] args) {
	        String s = "abcabcbb";
	        System.out.println(lengthOfLongestSubstring(s)); // Output: 3
	    }
	}

