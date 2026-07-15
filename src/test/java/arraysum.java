
import java.util.Arrays;

public class arraysum {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3 };
		int[] b = { 4, 5, 6, 7, 8};
		int[] c = { 4, 5, 6, 7, 8, 9,10 };
		int max = Math.max(a.length,Math.max(b.length,c.length));
		int[] sum = new int[max];

		for (int i = 0; i < max; i++) {
			
			if (i < a.length) {
				sum[i] += a[i];
			}

			if (i < b.length) {
				sum[i] += b[i];
			}
			

			if (i < c.length) {
				sum[i] += c[i];
			}
		}
		System.out.println(Arrays.toString(sum));
	}

}
