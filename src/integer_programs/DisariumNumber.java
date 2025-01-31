package integer_programs;

public class DisariumNumber {
	public static void main(String[] args) {
		// 1+3*3+5*5*5;
		// 1+9+125=135
		int number = 89;
		int check = number;
		int count = 0;
		int length = String.valueOf(number).length();
		while (length != 0) {
			int one = number % 10;
			number /= 10;
			int temp = 1;
			for (int i = 1; i <= length; i++) {
				temp *= one;
			}
			count += temp;
			length--;
		}
		if (count == check) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
