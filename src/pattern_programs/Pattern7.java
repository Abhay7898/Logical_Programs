package pattern_programs;

public class Pattern7 {
	/*
	7 6 5 4 3 2 1
	6 5 4 3 2 1
	5 4 3 2 1
	4 3 2 1
	3 2 1
	2 1
	1
	 */
	public static void main(String[] args) {
		for (int i = 7; i>=1; i--) {
			for (int j =i; j>=1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
