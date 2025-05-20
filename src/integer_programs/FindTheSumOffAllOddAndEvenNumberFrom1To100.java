package integer_programs;

public class FindTheSumOffAllOddAndEvenNumberFrom1To100 {
	public static void main(String[] args) {
		int oddSum = 0;
		int evenSum = 0;
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
		}
		System.out.println(evenSum);
		System.out.println(oddSum);
	}
}
