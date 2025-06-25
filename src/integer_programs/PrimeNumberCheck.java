package integer_programs;

public class PrimeNumberCheck {
	public static void main(String[] args) {
		int num = 9;
		boolean flage = false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.println("Not a prime number "+num);
				flage = true;
				break;
			}
		}
		if (!flage) {
			System.out.println("Yes, the  number is prime number "+ num);
		}
	}
}
