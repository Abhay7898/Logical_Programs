package pattern_programs;

public class Pattern26 {
	/*
    			0 
    		  1 0 1 
    		2 1 0 1 2 
    	  3 2 1 0 1 2 3 
    	4 3 2 1 0 1 2 3 4 
      5 4 3 2 1 0 1 2 3 4 5 
*/
	public static void main(String[] args) {
		for (int i = 0; i <=5; i++) {
			for (int j =5; j>=i; j--) {
				System.out.print("  ");
			}
			for (int j =i; j>=0; j--) {
				System.out.print(j+ " ");
			}
			for (int j =1; j <=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
