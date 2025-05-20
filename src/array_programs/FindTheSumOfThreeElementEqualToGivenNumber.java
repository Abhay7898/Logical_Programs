package array_programs;

public class FindTheSumOfThreeElementEqualToGivenNumber {
	public static void main(String[] args) {
		int a[] = { 5, -9, 4, -2,2, 7, 1, -4, -3, -7 };
		int sum = 9;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				for (int j2 = j + 1; j2 < a.length; j2++) {
					if (a[i] + a[j] + a[j2] == sum) {
						System.out.println(a[i] + "+" + a[j] + "+" + a[j2] + "=" + sum);
					}
				}
				
			}
		}
	}
}
