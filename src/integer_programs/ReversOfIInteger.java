package integer_programs;

public class ReversOfIInteger {
	public static void main(String[] args) {
		int num = 1234;
		int revers = 0;
		while (num != 0) {
			int one = num % 10;
			revers = revers * 10 + one;
			num /= 10;
		}
		System.out.println(revers);
	}
}
