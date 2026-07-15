 
public class sumofnumberString {

	public static void main(String[] args) {
	String s="test123run456";
	String res="";
	
	int sum=0;
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(Character.isDigit(ch)) {
			res=res+ch;
		}else if(!res.isEmpty()) {
			sum=sum+Integer.parseInt(res);
			res="";
			
		}
	}
	
	if(!res.isEmpty()) {
		sum=sum+Integer.parseInt(res);
	}

    System.out.println("sum of no in the string:"+ sum);
	}

}
