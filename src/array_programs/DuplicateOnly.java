package array_programs;

public class DuplicateOnly {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 1, 5,3,2,1 };
		for (int i = 0; i < a.length; i++) {
			boolean flage = false;
			boolean isCount = false;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					flage = true;
					break;
				}
			}
			if (!flage) {
				for (int j = 0; j < i; j++) {
					if (a[i] == a[j]) {
						isCount = true;
						break;
					}
				}
			}
			if (isCount) {
				System.out.print(a[i] + " ");
			}
		}
	}
}
