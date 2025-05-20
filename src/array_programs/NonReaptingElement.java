package array_programs;

public class NonReaptingElement {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 5, 6, 76, 8, 9, 10, 2, 3, 5, 6, 7, 8, 9, 10, 7, 3, 6, 7, };
		for (int i = 0; i < a.length; i++) {
			boolean flage = false;
			for (int j = 0; j < a.length; j++) {
				if (i != j && a[i] == a[j]) {
					flage = true;
					break;
				}
			}
			if (!flage) {
				System.out.print(a[i] + " ");
			}
		}
	}
}
