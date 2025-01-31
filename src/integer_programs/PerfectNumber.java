package integer_programs;

public class PerfectNumber {
	public static void main(String[] args) {
		int number =8128;
		int total=0;
		for (int i =1; i <=number/2; i++) {
			if (number%i==0) {
				total+=i;
			}
		}
		System.out.print(total);
	}
}
