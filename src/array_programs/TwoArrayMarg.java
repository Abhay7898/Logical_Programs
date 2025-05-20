package array_programs;

import java.util.Arrays;

public class TwoArrayMarg {
	public static void main(String[] args) {
		int one[] = { -7, 12, 17, 29, 41, 56, 79 };
		int two[] = { -9, -3, 0, 5, 19 };
		int index = 0;
		int newArray[] = new int[one.length + two.length];
		for (int i = 0; i < newArray.length; i++) {
			if (i < one.length) {
				newArray[i] = one[i];
			} else {
				newArray[i] = two[index++];
			}
		}
		System.out.println(Arrays.toString(newArray));
	}
}
