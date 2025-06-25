package pattern_programs;

public class Pattern29 {
	/**
			*
		   * *
		  *   *
		 *     *
		*       *
		 *     *
		  *   *
		   * *
		    *

*/
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			if (i>1) {
				for (int j =1; j <2*i-2; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 4; i>=1; i--) {
			for (int j =i-1; j <4; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			if (i>1) {
				for (int j =1; j < 2*i-2; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
