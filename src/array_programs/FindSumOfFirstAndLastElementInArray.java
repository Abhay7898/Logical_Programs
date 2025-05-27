package array_programs;

import java.util.Arrays;

public class FindSumOfFirstAndLastElementInArray {
	public static void main(String[] args) {
		int a[] = { 5, 34, 78, 2, 10, 11,44,10,45, 1, 99, 23 };
		int newArray[] = new int[(a.length + 1) / 2];
		int last = a.length - 1;
		for (int i = 0; i < newArray.length; i++) {
			if (i < a.length / 2) {
				newArray[i] = a[i] + a[last];
				last--;
			} else {
				newArray[i] = a[i];
			}
		}
		System.out.println(Arrays.toString(newArray));
	}
}
