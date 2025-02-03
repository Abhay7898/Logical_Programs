package string_programs;

public class VowelCount {
	public static void main(String[] args) {
		String s = "Abhay Garhwal";
		int count = 0;
		for (char c : s.toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U') {
				count++;
			}
		}
		System.out.println(count);
	}
}
