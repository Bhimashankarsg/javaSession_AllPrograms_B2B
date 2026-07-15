 
import java.util.ArrayList;

import java.util.LinkedHashMap;
import java.util.Map;

public class repeatedINdexWithoutCollection {

	public static void main(String[] args) {
		int a[] = { 5, 7, 1, 2, 9, 5, 3, 1, 2, 9, 5, 7, 9, 7 };
		int n = a.length;
		int result[][] = new int[n][n], count[] = new int[n], size = 0;

		for (int i = 0; i < n; i++) {
			int num = a[i], j;
			for (j = 0; j < size; j++)
				if (result[j][0] == num)
					break;
			if (j == size)
				result[size++][0] = num;
			 result[j][++count[j]] = i;
		}

		for (int i = 0; i < size; i++) {
			System.out.print(result[i][0] + " -> [");
			for (int j = 1; j <= count[i]; j++)
				System.out.print(result[i][j] + (j < count[i] ? ", " : ""));
			System.out.println("]");
		}
	}

}
