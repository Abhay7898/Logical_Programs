package array_programs;

import java.util.Arrays;

public class ArrayRevers {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int last=a.length-1;
		for (int i = 0; i <a.length/2; i++) {
			int temp=a[i];
			a[i]=a[last];
			a[last]=temp;
			last--;
		}
		System.out.println(Arrays.toString(a));
	}
}
