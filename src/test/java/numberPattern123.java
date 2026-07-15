 
public class numberPattern123 {

	public static void main(String[] args) {

 
 
  int space=6;
     int n=1;
  for(int i=0;i<7;i++)
  {
      for(int j=0;j<space;j++)
      {
          System.out.print(" ");
      }
   
      // Print increasing numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k + "");
            }
            
            // Print decreasing numbers
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k + "");
            }
      for(int j=0;j<space;j++)
      {
          System.out.print(" ");
      }
           System.out.println("");
     
      space--;
      
  }
    }
}

 
