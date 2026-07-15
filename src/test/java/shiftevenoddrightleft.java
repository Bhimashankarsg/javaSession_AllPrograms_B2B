 
import java.util.Arrays;

public class shiftevenoddrightleft {

	public static void main(String[] args) {
		 		
		int [] a= {3,5,2,8,9,5,4,6,11};
		
		int left=0;
		int right=a.length-1;
		int [] res=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				res[left++]=a[i];
			}
			else
			{
				res[right--]=a[i];
			}
		}
		
		System.out.println(Arrays.toString(res));

	}

}
