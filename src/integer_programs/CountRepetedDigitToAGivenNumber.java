package integer_programs;

public class CountRepetedDigitToAGivenNumber {
	public static void main(String[] args) {
		// output = 1, 2, 9 because this repented 4 time
		long num = 911112222299991l;
		String s = String.valueOf(num);

		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
					continue;
				} else {
					i = j;
					i--;
					break;
				}
			}
			if (count >= 4) {
				System.out.println(s.charAt(i));
			}
		}
	}
}
