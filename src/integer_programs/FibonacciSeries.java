package integer_programs;

public class FibonacciSeries {
	// 1,1,2,3,5,8,13,21,34
	public static void main(String[] args) {
		int range = 48;
		int f1 = -1, f2 = 1, f3 = 0;

		while (f3 <= range) {
			f3 = f1 + f2;
			if (f3 > range) {
				break;
			}
			System.out.print(f3+" ");
			f1 = f2;
			f2 = f3;

		}
	}
}
