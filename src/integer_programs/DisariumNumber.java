package integer_programs;

public class DisariumNumber {
	public static void main(String[] args) {
		// 1+3*3+5*5*5;
		// 1+9+125=135
		int number = 89;
		int check = number;
		int count = 0;
		int len = String.valueOf(number).length();

		while (len != 0) {
			int temp = 1;
			for (int i = 1; i <= len; i++) {
				temp *= number % 10;
			}
			count += temp;
			number /= 10;
			len--;
		}
		if (count == check) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
