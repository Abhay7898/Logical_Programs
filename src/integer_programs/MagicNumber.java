package integer_programs;

public class MagicNumber {
	public static void main(String[] args) {
		int number = 154;
		int check = 0;
		while (number != 0) {
			check += number % 10;
			number /= 10;
		}
		if (check == 10) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
