 import java.util.*;
public class specialcharacterBalancedorNotBalanced {

	public static void main(String[] args) {
		 
		
		String str="[]{}()";
		ArrayList<Character> list=new ArrayList<Character>();
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(list.size()>0 && ( ( ch=='}' && list.get(list.size()-1)=='{') || 
					( ch==']' && list.get(list.size()-1)=='[') || 
							( ch==')' && list.get(list.size()-1)=='(')))
			{
				list.remove(list.size()-1);
			}
			else
			{
				list.add(ch);
			}
		}
		if(list.isEmpty())
		{
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("Not Balanced");
		}

	}

}
