package integer_programs;

public class CountUptoNumberIsAddedUntilSingleDigit {
	public static void main(String[] args) {
		int number = 12;
		int count = 0;
		int check = 0;
		boolean falege = true;
		while (falege) {
			int one = number % 10;
			check += one;
			number /= 10;
			if (number == 0) {
				number = check;
				check = 0;
				count++;
				if (number > 0 && number < 9) {
					System.out.println(count);
					System.out.println(number);
					break;
				}
			}
		}
	}
}
