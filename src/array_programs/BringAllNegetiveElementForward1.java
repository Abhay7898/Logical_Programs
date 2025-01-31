package array_programs;

import java.util.Arrays;

public class BringAllNegetiveElementForward1 {
	public static void main(String[] args) {
		int a[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
		int next = 0;
		int temp[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				temp[next++] = a[i];
			}
		}
		for (int i = 0; i < temp.length; i++) {
			if (a[i] >= 0) {
				temp[next++] = a[i];
			}
		}
		System.out.println(Arrays.toString(temp));
	}
}
