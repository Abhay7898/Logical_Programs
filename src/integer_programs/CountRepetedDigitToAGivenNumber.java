package integer_programs;

public class CountRepetedDigitToAGivenNumber {
	public static void main(String[] args) {
		// output = 1, 2, 9 because this repented 4 time
		long num = 9111122222999911l;
		String s = String.valueOf(num);

		for (int i = 0; i < s.length();) {
			int count = 1;
			int next = i + 1;
			while (next < s.length() && s.charAt(i) == s.charAt(next)) {
				count++;
				next++;
			}
			System.out.println(s.charAt(i) + " " + count);
			i = next;
		}
	}
}
