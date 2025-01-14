package array_programs;

public class OnlyDuplicate {
	public static void main(String[] args) {
		int a[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1,89, 2, 3, 5, 6, 7, 8, 9, 10, 2, 3, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < a.length; i++) {
			boolean flage =false;
			for (int j = 0; j < a.length; j++) {
				if (i!=j&&a[i]==a[j]) {
					flage=true;
				}
			}
		}
	}
}
