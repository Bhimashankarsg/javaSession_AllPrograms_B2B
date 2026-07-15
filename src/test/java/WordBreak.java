

public class WordBreak {

	// Function to check if a word exists in the wordDict (without inbuilt methods)
	public static boolean existsInDict(String[] wordDict, String word) {
		for (int i = 0; i < wordDict.length; i++) {
			if (wordDict[i].equals(word)) {
				return true;
			}
		}
		return false;
	}

	public static boolean wordBreak(String s, String[] wordDict) {
		int n = s.length();
		boolean[] dp = new boolean[n + 1]; // DP array to store segmentability
		dp[0] = true; // Base case: empty string is always segmentable

		// Loop through the string
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				// Extract substring manually (s.substring(j, i))
				String word = "";
				for (int k = j; k < i; k++) {
					word += s.charAt(k);
				}

				if (dp[j] && existsInDict(wordDict, word)) {
					dp[i] = true;
					break; // No need to check further
				}
			}
		}

		return dp[n];
	}

	public static void main(String[] args) {
		String s = "leetcode";
		String[] wordDict = { "leet", "code" };
		System.out.println(wordBreak(s, wordDict)); // Output: true
	}
}
