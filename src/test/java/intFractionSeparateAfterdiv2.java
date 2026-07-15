
import java.util.ArrayList;
import java.util.List;

public class intFractionSeparateAfterdiv2 {

	public static void main(String[] args) {
		 int []a={2,3,4};
		  List<Integer> integerParts = new ArrayList();
		        List<Double> fractionalParts = new ArrayList();
		 
		 double odd[]=new double[a.length];
		  
		 for(int i=0;i<a.length;i++)
		 {
		     if(a[i]%2!=0){
		     
		    odd[i]=(double)a[i]/2;
		  
		    }
		     
		 }
		 
		 for (double num : odd) {
		            int intPart = (int) num;
		            double fracPart = num - intPart;

		            integerParts.add(intPart);
		            fractionalParts.add(fracPart);
		        }

		        System.out.println("Integer parts: " + integerParts);
		        System.out.println("Fractional parts: " + fractionalParts);
		 
		 
		    }
		}