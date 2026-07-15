 
public class substringSearch {

	public static void main(String[] args) {
		 
		String str1="selenium";
		String str2="ium";
		boolean flag=false;
		for(int i=0;i<str1.length();i++)
		{
			for(int j=i+1;j<=str1.length();j++)
			{
				String sub=str1.substring(i,j);
				if(sub.equals(str2))
				{
					flag=true;
					System.out.println(str2+" is in "+str1);
					break;
				}
			}
		}
		
		if(!flag)
		{
			System.out.println(str2+" is not in "+str1);
		}

	}

}
