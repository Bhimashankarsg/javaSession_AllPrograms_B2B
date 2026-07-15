 
public class progra2 {

	public static void main(String[] args) {
		String s = "ramannara";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			// Unique value - mn
			if (s.indexOf(ch) == s.lastIndexOf(ch)) {
				System.out.print(ch);
			}
			// System.out.print(" duplicate value - one time");
			
			/*
			 * // duplicate value - one time - ra if (s.indexOf(ch) != s.lastIndexOf(ch) &&
			 * i == s.indexOf(ch)) { System.out.print(ch); }
			 */
			 

		}

	}
};
