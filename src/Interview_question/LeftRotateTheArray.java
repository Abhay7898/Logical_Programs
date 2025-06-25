package Interview_question;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LeftRotateTheArray {
	// output list = [8,9,2,3,4,5,6]

	public static void main(String[] args) {

		int a[] = { 2, 3, 4, 5, 6, 8, 9 };
		int k = 3;
		
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < k; i++) {
			int e = a[a.length - 1];
			int last = a.length - 1;
			
			while (last != 0) {
				a[last] = a[last - 1];
				last--;
			}
			if (last == 0) {
				a[last] = e;
			}
			
		}
		System.out.println(Arrays.toString(a));
	}
}
