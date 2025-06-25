package Interview_question;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayEmpty {
	/*
	 * Remove all elements but at the only one elements will remove and if the
	 * elements is duplicate then remove one. Till array got empty. And print how
	 * many time on get array empty. Array – [1,1,1,2,2,5,0,0,6]
	 */
	public static void main(String[] args) {
		int a[] = { 1, 1, 1, 2, 2, 5, 0, 0, 6 };
		int count = 0;

		if (a.length == 0) {
			System.out.println("Array is Alredy Empty");
		} else {
			while (true) {
				if (a.length == 0) {
					break;
				}
				int temp[] = new int[a.length - 1];
				for (int i = 0; i < a.length - 1; i++) {
					temp[i] = a[i];
				}

				a = new int[temp.length];
				for (int i = 0; i < temp.length; i++) {
					a[i] = temp[i];
				}
				count++;
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(count);
	}
}
