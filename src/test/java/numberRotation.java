 
import java.util.Arrays;

public class numberRotation {

	public static void main(String[] args) {
	 
		int a[]= {3,5,8,2,6,9};
		int times=1;
		iterate(a,times);
	}
	
	public static void iterate(int []a,int times)
	{
	
		for(int i=1;i<=times;i++)
		{
			int temp=a[a.length-1];
			
			for(int j=a.length-1;j>0;j--)
			{
				a[j]=a[j-1];
			}
			
			a[0]=temp;
		}
		
		System.out.println(Arrays.toString(a));
	}

}
