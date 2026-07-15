 
import java.util.Arrays;

public class shiftZeroesToleftSide {

	public static void main(String[] args) {
		 int [] a= {2,3,4,5,0,5,1,0};
		 int [] result=new int[a.length];
		 int last=result.length-1;
		 for(int i=a.length-1;i>=0;i--)
		 {
			 if(a[i]!=0)
			 {
				 result[last--]=a[i];
			 }
		 }
		 
		 System.out.println(Arrays.toString(result));
	}

}
