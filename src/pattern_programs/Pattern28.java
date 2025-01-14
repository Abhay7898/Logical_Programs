package pattern_programs;

public class Pattern28 {
	/*
    1  
   2 3 
  4 5 6
7 8 9 10
*/ 
	public static void main(String[] args) {
		int num=1;
		int row=4;
		for (int i =1; i <=row; i++) {
			for (int j =i; j <row; j++) {
				System.out.print(" ");
			}
			for (int j =1; j <=i; j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}
