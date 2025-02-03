package integer_programs;

public class PrimeNumberFrom1to100 {
	public static void main(String[] args) {
		int numbet = 1;
		while (numbet != 100) {
			boolean falge = false;
			if (numbet < 2) {
				numbet++;
				continue;
			} else {
				for (int i = 2; i <= numbet / 2; i++) {
					if (numbet % i == 0) {
						falge = true;
						break;
					}
				}
				if (!falge) {
					System.out.print(numbet + " ");
				}
				numbet++;
			}
		}
	}
}
