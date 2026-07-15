
public class pattern_diamondNumber2 {
 
	  public static void main(String[] args) {
	       int n=5;
	       //int space=4,star=1;
	       int num=0,cont=0;
	       for(int row=1;row<=n;row++)
	       {
	             for(int sp=1;sp<=n-row;sp++)
	            {
	                System.out.print("  ");
	            }
	           for(int col=1;col<=row;col++)
	           {
	              
	               System.out.print("  "+row);
	           }
	         
	           System.out.println();
	            cont=row;
	       }
	    
	       for(int row=1;row<=n-1;row++)
	       {
	             for(int sp=1;sp<=row;sp++)
	            {
	                System.out.print("  ");
	            }
	           for(int col=1;col<=n-row;col++)
	           {
	           
	               System.out.print("  "+(cont-1));
	           }
	         
	           System.out.println();
	        cont--;
	       }
	    }
		}

