package Interview_question;

import java.util.Arrays;

public class RightRotateTheArray {
	// output list = [4,5,6,8,9,2,3]

	public static void main(String[] args) {
		int a[] = { 2, 3, 4, 5, 6, 8, 9 };
		int k = 2;
		for (int i = 0; i < 2; i++) {
			int e = a[0];
			int first = 0;
			while (first != a.length - 1) {
				a[first] = a[first + 1];
				first++;		
				if (first == a.length - 1) {
					a[first] = e;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
