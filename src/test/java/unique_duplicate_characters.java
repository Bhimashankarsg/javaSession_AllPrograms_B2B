 
public class unique_duplicate_characters {

	public static void main(String[] args) {
		 String str="selenium java";
		 System.out.println("\n Unique values : ");
		 for(int i=0;i<str.length();i++) {
			 char ch=str.charAt(i);
			 if(str.indexOf(ch)==str.lastIndexOf(ch))
			 {
				 
				 System.out.print(ch);
			 }
			 
			 
		 }
		 System.out.println("\n Duplicate character values : ");
		 for(int i=0;i<str.length();i++) {
			 char ch=str.charAt(i);
			 if(str.indexOf(ch)!=str.lastIndexOf(ch) &&  i==str.indexOf(ch) )
			 {
				 System.out.print(ch);
			 }
			 
			 
		 }
	}

}
