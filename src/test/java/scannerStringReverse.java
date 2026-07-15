 
import java.util.Scanner;

public class scannerStringReverse {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		String s=sc.nextLine();
		
		String [] as=s.split(" ");
		for(int i=as.length-1;i>=0;i--)
		{
			
			
			if(i==1)
			{
				for(int j=as[i].length()-1;j>=0;j--)
				{
					System.out.print(as[i].charAt(j));
					
				}
				System.out.println();
			} else
			System.out.println(as[i]);
		}

	}

}
