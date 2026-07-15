 
public class Pyramid1 {
	public static void main(String[] args) {
		int rowNum=10;
		//print lines--->3 lines
		for(int i=1;i<=rowNum;i++) {
			//print spaces
			for(int j=1;j<=rowNum-i;j++) {
				System.out.print(" ");
			}
			//print stars
			for(int k=1;k<=(2*i-1);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
