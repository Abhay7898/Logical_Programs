package array_programs;

public class DuplicateOnly {
	public static void main(String[] args) {
		int a[] = { 1, 2, 6,4,3, 4, 1, 5, 3, 2, 1 };
		for (int i = 0; i < a.length; i++) {
			boolean isDuplicate = false;
			boolean isPrinted = false;

			// to check a element is duplicate or not
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					isDuplicate = true;
					break;
				}
			}
			// To check the element is printed or not 
			if (isDuplicate) {
				for (int j = 0; j < i; j++) {
					if (a[i] == a[j]) {
						isPrinted = true;
						break;
					}
				}
				if (!isPrinted) {
					System.out.print(a[i] + " ");
				}
			}
		}

		System.out.println();

		int a1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 5, 6, 7, 83, 9, 10, 1, 2, 3, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < a1.length; i++) {
			boolean isDupliacte = false;
			boolean isPrinted = false;
			for (int j = 0; j < a1.length; j++) {
				if (i != j && a1[i] == a1[j]) {
					isDupliacte = true;
					break;
				}
			}
			if (isDupliacte) {
				for (int j = 0; j < i; j++) {
					if (a1[i] == a1[j]) {
						isPrinted = true;
						break;
					}
				}
				if (!isPrinted) {
					System.out.print(a1[i] + " ");
				}
			}
		}
	}
}
