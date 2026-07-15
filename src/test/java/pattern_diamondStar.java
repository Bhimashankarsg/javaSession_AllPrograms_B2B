
public class pattern_diamondStar {
 
		    public static void main(String[] args) {
		       int n=5;
		       //int space=4,star=1;
		       for(int row=1;row<=n;row++)
		       {
		             for(int sp=1;sp<=n-row;sp++)
		            {
		                System.out.print(" ");
		            }
		           for(int col=1;col<=row;col++)
		           {
		               System.out.print(" *");
		           }
		         
		           System.out.println();
		        
		       }
		       
		       for(int row=1;row<=n-1;row++)
		       {
		             for(int sp=1;sp<=row;sp++)
		            {
		                System.out.print(" ");
		            }
		           for(int col=1;col<=n-row;col++)
		           {
		               System.out.print(" *");
		           }
		         
		           System.out.println();
		        
		       }
		    }
		}

