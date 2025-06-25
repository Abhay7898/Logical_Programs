package integer_programs;

public class SumAndMultipictationIsEqual {
//		we are having 1124 as a number 
//		1+1+2+4= 8 
//		1*1*2*4 = 8
	public static void main(String[] args) {
		int num = 1124;
		int sum = 0;
		int multi = 1;

		while (num != 0) {
			sum += num % 10;
			multi = multi * (num % 10);
			num /= 10;
		}
		if (sum == multi) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
