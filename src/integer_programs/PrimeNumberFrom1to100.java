package integer_programs;

public class PrimeNumberFrom1to100 {
	public static void main(String[] args) {
		int number = 1;
		while (number != 100) {
			boolean falge = false;
			if (number < 2) {
				number++;
				continue;
			} else {
				for (int i = 2; i <= number / 2; i++) {
					if (number % i == 0) {
						falge = true;
						break;
					}
				}
				if (!falge) {
					System.out.print(number + " ");
				}
				number++;
			}
		}
	}
}
