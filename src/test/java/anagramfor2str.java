import java.util.Arrays;

public class anagramfor2str {

	public static void main(String[] args) {
		 String a="Silent";
		 String b="Listen";
		 
		 if(a.length()==b.length())
		 {
			 a=a.toLowerCase();
			 b=b.toLowerCase();
			 
			 char cha[]=a.toCharArray();
			 char chb[]=b.toCharArray();
			 
			 Arrays.sort(cha);
			 Arrays.sort(chb);
			 System.out.println(cha);
			 System.out.println(chb);
			 
			 a=new String(cha);
			 b=new String(chb);
			 if(a.equals(b))
			 {
				 System.out.print("Anagram");
			 }else
			 {
				 System.out.print("not anagram...");
			 }
			 
		 }
		 else {
			 System.out.print("not anagram");
		 }

	}

}
