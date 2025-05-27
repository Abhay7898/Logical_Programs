package array_programs;

import java.util.Arrays;

public class SumOfPairElement {
	public static void main(String[] args) {
		int a[] = { 5, 34, 78, 2, 45, 1, 99, 23, 10, 10, 12 };
		int newArray[] = new int[(a.length + 1) / 2];
		int index = 0;

		for (int i = 0; i < a.length; i = i + 2) {
			if (i < a.length - 1) {
				newArray[index++] = a[i] + a[i + 1];
				continue;
			}
			newArray[index] = a[i];
		}
		System.out.println(Arrays.toString(newArray));
	}
}
