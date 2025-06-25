package Interview_question;

public class SleepForTwoSeconds {
	/*
	 * Insert 15 element print 3 elements then sleep for 2 second then print next
	 * three using array.
	 */
	public static void main(String[] args) throws InterruptedException {
		int a[] = { 1, 2, 3, 5, 6, 8, 9, 5, 5, 3, 3, 4, 5, 6, 7, 8, 8, 7, 6, 5, 2, 2, 2, 1, 1, 1, 1, 1, 1, };
		int count = 3;
		for (int i = 0; i < a.length; i++) {
			if (i == count) {
				count += 3;
				Thread.sleep(2000);
			}
			System.out.print(a[i] + " ");
		}
	}
}
