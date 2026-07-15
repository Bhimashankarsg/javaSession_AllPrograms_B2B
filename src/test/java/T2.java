 
public class T2 {
	public static void main(String[] args) {
		int rowNum=3;
		int colNum=3;
		for(int i=1;i<=rowNum;i++) {
			for(int j=1;j<=colNum;j++) {
				if(i<=j) {
					System.out.print("*");
				}else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
