package array_programs;

public class PrimeNumberCheck {
	public static void main(String[] args) {
		boolean flage = false;
		int number = 5;
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				System.out.println("No, " + number + " is not a Prime Number");
				flage = true;
			}
		}
		if (!flage) {
			System.out.println(" Yes, " + number + " is a Prime Number");
		}
	}
}
