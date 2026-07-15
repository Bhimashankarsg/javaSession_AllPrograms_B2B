 
public class reversewithoutreversigspace {
	public static void main(String[] args) {
		String s = "I Love my name";
		//ILovemyname
		String s1 = s.replaceAll(" ", "");
		
		int index = s1.length() - 1;
System.out.println(index);
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				System.out.print(" ");// 
			} else {
				System.out.print(s1.charAt(index));//e 
				index--;
			}
		}
	}
}
