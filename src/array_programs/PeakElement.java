package array_programs;

public class PeakElement {
	public static void main(String[] args) {
		int[] a = { 14, 12, 13, 11, 5, 4, 3, 10 };
		int n = a.length;

		for (int i = 0; i < n; i++) {
			boolean left = true;
			boolean right = true;
			if (i > 0 && a[i] <= a[i - 1])
				left = false;

			if (i < n - 1 && a[i] <= a[i + 1])
				right = false;

			if (left && right) {
				System.out.println(a[i]);
			}
		}
	}
}
