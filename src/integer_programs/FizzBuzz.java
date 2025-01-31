package integer_programs;

public class FizzBuzz {
	public static void main(String[] args) {
		// num/3 =fizz,
		// num/5 =buzz,
		// num/3 and num/5=fizzBuzz
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i + "/3 = Fizz");
			}
			if (i % 5 == 0) {
				System.out.println(i + "/5 = Fizz");
			}
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + "/3 and " + i + "/5 = FizzBuzz");
			}
		}
	}
}
