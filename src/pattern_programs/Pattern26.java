package pattern_programs;

public class Pattern26 {
	/*
	    0
	   101
	  21012
	 3210123
	432101234
   54321012345
   */
	public static void main(String[] args) {
		for (int i = 0; i <=5; i++) {
			for (int j =i; j<5; j++) {
				System.out.print(" ");
			}
			for (int j =i; j>=0; j--) {
				System.out.print(j);
			}
			for (int j =1; j <=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
