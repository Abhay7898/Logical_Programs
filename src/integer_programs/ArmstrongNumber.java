package integer_programs;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int num = 1634;
		int check = num;

		int sum = 0;

		//int digit = String.valueOf(num).length();
		
		int digit=0, just=num;
		while (just!=0) {
			digit++;
			just/=10;
		}
		
		while (num != 0) {
			int temp = 1;
			int single = num % 10;
			for (int i = 0; i < digit; i++) {
				temp *= single;
			}
			sum += temp;
			num /= 10;
		}
		if (sum==check) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
