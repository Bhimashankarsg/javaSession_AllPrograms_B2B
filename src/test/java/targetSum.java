 
public class targetSum {

	public static void main(String[] args) {
		 
		int []a= {3,5,2,8,7,12};
		int targetSum=10;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				System.out.println("i:"+a[i]+"j:"+a[j]);
				if(a[i]+a[j]==targetSum)
				{
					System.out.println("in : i:"+a[i]+"j:"+a[j]);
				}
			}
		}

	}

}
