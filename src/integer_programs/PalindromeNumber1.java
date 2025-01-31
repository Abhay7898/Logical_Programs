package integer_programs;

public class PalindromeNumber1 {
	public static void main(String[] args) {
		int number = 12321;
		int check = number;
		int pen = 0;
		while (number > 0) {
			int one = number % 10;
			pen=(pen*10)+one;
			number/=10;
		}
		if (pen==check) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
