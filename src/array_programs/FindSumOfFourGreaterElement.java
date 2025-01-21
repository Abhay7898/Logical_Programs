package array_programs;

public class FindSumOfFourGreaterElement {
	public static void main(String[] args) {
		int a[] = { 1, 2, 9, 7, 6, 8, 7 };
		int sum = 0;
		if (a.length <= 4) {
			for (int i = 0; i < a.length; i++) {
				sum += a[i];
			}
		} else {
			// Arrays.sort(a);
			for (int i = 0; i < a.length; i++) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] > a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
			for (int i = a.length - 4; i < a.length; i++) {
				sum += a[i];
			}
		}
		System.out.println(sum);
	}
}
