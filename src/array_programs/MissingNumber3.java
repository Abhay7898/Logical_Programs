package array_programs;

import java.util.Arrays;

public class MissingNumber3 {
	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 5, 7, 17, 8, 9, 10, 12, 14, 15 };
		Arrays.sort(a);
		for (int i = a[0]; i <= a[a.length - 1]; i++) {
			boolean isThere = false;
			for (int j = 0; j < a.length; j++) {
				if (i == a[j]) {
					isThere = true;
					break;
				}
			}
			if (!isThere) {
				System.out.print(i + " ");
			}
		}
	}
}
