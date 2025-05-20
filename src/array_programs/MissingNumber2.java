package array_programs;

import java.util.Arrays;

public class MissingNumber2 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 6, 7, 9, 10 };

		//Perform sorting and find the max number
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		// Or use Arrays class sort method
		Arrays.sort(a);
		 
		for (int i = 0; i < a[a.length-1]; i++) {
			boolean falge =false;
			for (int j = 0; j < a.length; j++) {
				if (i==a[j]) {
					falge=true;
					break;
				}
			}
			if (!falge) {
				System.out.print(i+" ");
			}
		}
	}
}
