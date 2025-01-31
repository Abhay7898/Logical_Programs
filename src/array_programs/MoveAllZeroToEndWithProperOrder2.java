package array_programs;

import java.util.Arrays;

public class MoveAllZeroToEndWithProperOrder2 {
	public static void main(String[] args) {
		int a[] = { 2, 3, 0, 5, 3, 0, 0, 7, 5, 0, 2 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == 0 && a[j] != 0) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
