 
public class separateCharacter {

	public static void main(String[] args) {
		 
		String str="aD@#2k 9";
		String uc="";
		String lc="";
		String dc="";
		String sp="";
		for(int i=0;i<str.length()-1;i++)
		{
		char ch=str.charAt(i);
		if(Character.isUpperCase(ch))
		{
			uc+=ch;
		}else if(Character.isLowerCase(ch))
		{
			lc+=ch;
			
		}else if(Character.isDigit(ch))
		{
			dc+=ch;
		}
		else 
		{
			sp+=ch;
		}
		}
		
		System.out.println("uppercase : "+uc);
		System.out.println("lowercase : "+lc);
		System.out.println("digit:"+dc);
		System.out.println("spl char : "+sp);

	}

}
