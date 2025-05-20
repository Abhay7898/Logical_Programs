package integer_programs;

public class CountUptoNumberIsAddedUntilSingleDigit {
	public static void main(String[] args) {
		int number = 76589;
		int count = 0;
		int check = 0;
		while (true) {
			check += number % 10;
			number /= 10;
			if (number == 0) {
				number = check;
				check = 0;
				count++;
				if (number > 0 && number <= 9) {
					System.out.println(count);
					System.out.println(number);
					break;
				}
			}
		}
	}
}
