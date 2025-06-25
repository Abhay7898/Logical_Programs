package array_programs;

public class MissingNumber {
	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 5, 7, 17, 8, 9, 10, 12, 14, 15 };
		int max = a[0];
		int min = 0;
		for (int i : a) {
			if (i > max) {
				max = i;
			}
			if (i < min) {
				min = i;
			}
		}

		for (int i = min; i <= max; i++) {
			boolean falge = false;
			for (int j = 0; j < a.length; j++) {
				if (i == a[j]) {
					falge = true;
					break;
				}
			}
			if (!falge) {
				System.out.print(i + " ");
			}
		}
	}
}
