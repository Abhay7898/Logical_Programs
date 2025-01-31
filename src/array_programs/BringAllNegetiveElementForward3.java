package array_programs;

import java.util.Arrays;

public class BringAllNegetiveElementForward3 {
	public static void main(String[] args) {
		int a[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
		int next=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]<0) {
				if (i!=next) {
					int temp=a[i];
					for (int j =i; j>next; j--) {
						a[j]=a[j-1];
					}
					a[next]=temp;
				}
				next++;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
