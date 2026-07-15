 
public class remoDupl {

	public static void main(String[] args) {

		String s = "ababbaaccdt";
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (res.indexOf(ch) == -1) {
				res += ch;
			}
		}
		System.out.println(res);

	}

}
