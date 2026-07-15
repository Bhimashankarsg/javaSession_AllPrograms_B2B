
public class expandString {

	public static void main(String[] args) {
		 String s="a3b2c2a1b1c1";
		 for(int i=0;i<s.length();i=i+2)
		 {
			 char ch=s.charAt(i);
			 int num=s.charAt(i+1)-48;
			 for(int j=1;j<=num;j++)
			 {
				 System.out.print(ch);
			 }
		 }

	}

}
