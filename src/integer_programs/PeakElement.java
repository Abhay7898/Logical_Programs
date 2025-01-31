package integer_programs;

public class PeakElement {
	public static void main(String[] args) {
		int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2 };
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			boolean left = true;
			boolean right = true;
			if (i > 0 && arr[i] <= arr[i - 1])
				left = false;
			if (i < n - 1 && arr[i] <= arr[i + 1])
				right = false;
			if (left && right) {
				System.out.println(arr[i]);
			}
		}
	}
}
