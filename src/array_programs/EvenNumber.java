package array_programs;

public class EvenNumber {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 2, 3, 4, 3, 6, 5, 4, 6, 4, 8, 8, 5, 6, 3, 2 };
		for (int i = 0; i < a.length; i++) {
			boolean flage = false;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					flage = true;
					break;
				}
			}
			if (!flage && a[i] % 2 == 0) {
				System.out.print(a[i] + " ");
			}
		}
	}
}
