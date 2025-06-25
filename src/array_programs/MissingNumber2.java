package array_programs;


public class MissingNumber2 {
	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 5, 7, 17, 8, 9, 10, 12, 14, 15 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for (int i = a[0]; i <= a[a.length - 1]; i++) {
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
