 
public class subStringPalindrome {

	public static void main(String[] args) {

		String str = "abaaca";

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String s1 = str.substring(i, j);
				if (ispalindrome(s1) && s1.length() > 1) {
					System.out.println(s1 + " ");
				}
			}
		}

	}

	public static boolean ispalindrome(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev += s.charAt(i);
		}
		if (s.equals(rev)) {
			return true;
		} else {
			return false;
		}

	}

}
