package array_programs;

import java.util.Arrays;

public class ArrayRotation {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		int frist = 0;
		int last = a.length - 1;
		
		// First way
		while (frist < a.length / 2) {
			int temp = a[frist];
			a[frist] = a[last];
			a[last] = temp;
			last--;
			frist++;
		}
		System.out.println(Arrays.toString(a));
		
		//Second way
		frist=0;
		last=a.length-1;
		while (frist!=last) {
			int temp = a[frist];
			a[frist] = a[last];
			a[last] = temp;
			last--;
			frist++;
		}
		System.out.println(Arrays.toString(a));
		
	}
}
