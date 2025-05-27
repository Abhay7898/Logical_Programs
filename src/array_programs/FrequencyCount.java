package array_programs;

public class FrequencyCount {
	public static void main(String[] args) {
		int[] a = { -1, 2, 3, 2, 3, 4, 3, 6, 5, 4, 6, 4, 8, 8, 5, 6, 3, 2 };
		for (int i = 0; i < a.length; i++) {
			boolean isPrinted = false;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					isPrinted = true;
					break;
				}
			}
			if (!isPrinted) {
				int count =1;
				for (int j = i+1; j < a.length; j++) {
					if (a[i]==a[j]) {
						count++;
					}
				}
				System.out.println(a[i]+" "+count);
			}
		}
	}
}
