package array_programs;

import java.util.Arrays;

public class MoveAllZeroToEndWithProperOrder {
	public static void main(String[] args) {
		int a[] = { 2, 3, 0, 5, 3, 0, 0, 7, 5, 0, 2 };
		int newArray[] = new int[a.length];
		int index = 0;
		for (int i : a) {
			if (i != 0) {
				newArray[index++] = i;
			}
		}
		System.out.println(Arrays.toString(newArray));
	}
}
