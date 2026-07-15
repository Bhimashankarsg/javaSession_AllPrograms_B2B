 
public class secondmax {

	public static void main(String[] args) {
		int[] a = { 10, 20, 10, 40, 20, 25, 10, 22, 41, 40, 25, 10 };
		int max = Integer.MIN_VALUE;
		int sec_max = Integer.MIN_VALUE;
		int third_max = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				sec_max = max;
				max = a[i];
			} else if (a[i] > sec_max && a[i] != max) {
				sec_max = a[i];
			} else if (a[i] > third_max && a[i] != max && a[i] != sec_max) {
				third_max = a[i];
			}

		}
		System.out.println(max);
		System.out.println(sec_max);
		System.out.println(third_max);

	}

}
