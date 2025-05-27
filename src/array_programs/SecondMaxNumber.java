package array_programs;

public class SecondMaxNumber {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 78, 5, 6, 7, 8, 9, 100, 11 };
		int max = a[0];
		int secondMax = a[0];
		for (int i : a) {
			if (i > max) {
				secondMax = max;
				max = i;
			} else if (max > i && secondMax < i) {
				secondMax = i;
			}
		}
		System.out.println(max);
		System.out.println(secondMax);
	}
}
