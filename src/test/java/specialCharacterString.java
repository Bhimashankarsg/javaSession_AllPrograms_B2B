 
public class specialCharacterString {

	public static void main(String[] args) {

		String str = "123456789";
 
		String [] res=new String[str.length()];
		 int left = 0;                   // Pointer for even numbers (left side)
	        int right = str.length() - 1; 
		for(int i=0;i<str.length();i++)
		{
		 char ch=str.charAt(i);
		 
		 int n= (int) (ch-48);
		  if(n%2==0)
		  {
			  res[left] = Integer.toString(n);
              left++; 
		  }
		  else
		  {
			  res[right] = Integer.toString(n);
              right--;
		  }
		}
		
		// String result = String.join("", res);
	        System.out.println("Rearranged String: " + res);
		
		 
		
		 
	}

}
