package array_programs;

import java.util.Arrays;

public class ArrayRevers {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int last = a.length - 1;
		//For loop
		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[last];
			a[last] = temp;
			last--;
		}
		System.out.println(Arrays.toString(a));
		
		
		//While loop
		int first = 0;
		last = a.length - 1;
		while (first < a.length / 2) {
			int temp = a[first];
			a[first] = a[last];
			a[last] = temp;
			first++;
			last--;
		}
		System.out.println(Arrays.toString(a));
	}
}
