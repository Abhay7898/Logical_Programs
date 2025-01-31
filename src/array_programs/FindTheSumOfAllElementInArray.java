package array_programs;

public class FindTheSumOfAllElementInArray {
	public static void main(String[] args) {
		int a[] = { 5, 34, 78, 2, 45, 1, 99, 23 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum);
	}
}
