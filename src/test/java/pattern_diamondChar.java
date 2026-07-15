
public class pattern_diamondChar {
 
	  public static void main(String[] args) {
		  int n=5;
	        char ch='A';
	           for(int row=1;row<=n;row++)
			       {
						/*
						 * for(int sp=1;sp<=row;sp++) { System.out.print(" "); }
						 */
			           for(int col=1;col<=n-row;col++)
			           {
			              
			               System.out.print(ch++);
			           }
			         
			           System.out.println();
			       
			       }
	    }
		}

