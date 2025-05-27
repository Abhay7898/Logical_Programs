package array_programs;

public class MaxNumber {
	public static void main(String[] args) {
		int a[] = { 5, 34,99, 245,100,78, 2, 45, 1, 23 };
		int max=a[0];
		for (int i : a) {
			if (i>max) {
				max=i;
			}
		}
		System.out.println(max);
	}
}
