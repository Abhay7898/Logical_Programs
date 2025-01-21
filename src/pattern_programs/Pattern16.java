package pattern_programs;

public class Pattern16 {
	/*
	01000000
	00200000
	00030000
	00004000
	00000500
	00000060
	00000007
	*/
	public static void main(String[] args) {
		for (int i = 1; i <=7; i++) {
			for (int j = 0; j <=7; j++) {
				if (i==j) {
					System.out.print(j);
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
}
