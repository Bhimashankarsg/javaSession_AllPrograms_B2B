 
public class NumberPyramid {
	public static void main(String[] args) {
		int rowNum=3;
		//print lines
		for(int i=1;i<=rowNum;i++) {
			//spaces
			for(int j=1;j<=2*(rowNum-i);j++) {
				System.out.print(" ");
			}
			//print increasing number
			for(int k=1;k<=i;k++) {
				System.out.print(k+" ");
			}
			
			//decreasing number
			for(int l=i-1;l>=1;l--) {
				System.out.print(l+" ");	
			}
			System.out.println();
		}
	}
}

/*
 *     1 
 *   1 2 1 
 * 1 2 3 2 1
 */