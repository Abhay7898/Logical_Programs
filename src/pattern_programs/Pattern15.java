package pattern_programs;

public class Pattern15 {
	/**
	 * 1111111
	 * 1111122
	 * 1111333
	 * 1114444
	 * 1155555
	 * 1666666
	 * 7777777
	 */
	public static void main(String[] args) {
		for (int i = 1; i <=7; i++) {
			for (int j =1; j <=7; j++) {
				if (j<=7-i) {
					System.out.print(1);
				}else {
					System.out.print(i);
				}
			}
			System.out.println();
		}
	}
}
