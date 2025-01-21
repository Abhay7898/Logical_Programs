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
		for (int i = 1; i <=5; i++) {
			for (int j = 5; j>i; j--) {
				System.out.print(" ");
			}
			System.out.print("@");
			if (i>1) {
				for (int j = 2; j <i*2-1; j++) {
					System.out.print(" ");
				}
				System.out.print("@");
			}
			System.out.println();
		}
		for (int i =4; i >=1; i--) {
			for (int j =i; j <=4; j++) {
				System.out.print(" ");
			}
			System.out.print("@");
			if (i>1) {
				for (int j =i*2-1; j >2; j--) {
					System.out.print(" ");
				}
				System.out.print("@");
			}
			System.out.println();
		}
	}
}
