package integer_programs;

public class PalindromeNumber1 {
	public static void main(String[] args) {
		int number = 12321;
		int check = number;
		int pen = 0;
		
		while (number != 0) {
			pen = (pen * 10) + number % 10;
			number /= 10;
		}
		if (pen == check) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
