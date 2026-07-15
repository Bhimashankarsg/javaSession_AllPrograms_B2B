

public class prime_no {

	public static void main(String[] args) {
		 for(int j=0;j<100;j++)
		 {
		int no=j,count=0;
		for(int i=1;i<no;i++)
		{
			if(no%i==0)
			{
				System.out.println(no);
				count++;
			}
		}
		
		if(count==2)
		{
			System.out.println(no+"is prime number");
		}else
		{
			System.out.println(no+"is not prime number");
		}
		 }

	}

}
