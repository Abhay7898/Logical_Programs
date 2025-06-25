package array_programs;

import java.util.Arrays;

public class MoveAllZeroToEndWithProperOrder2 {
	public static void main(String[] args) {
		int a[] = { 2, 3, 0, 0, 0, 5, 3, 0, 1, 0, 0, 0, 7, 5, 0, 2 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				continue;
			}
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] != 0) {
					a[i] = a[j];
					a[j] = 0;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
