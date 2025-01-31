package string_programs;

public class FindNextCharacterAndNextNumber {
	public static void main(String[] args) {
		String s = "I3 A2M N7O4T A1B8H3AYZ G1AR9H0W4A6L1";
		String newString = "";
		for (char c : s.toCharArray()) {
			if (c == ' ') {
				newString += c;
				continue;
			} else if (c == 'z') {
				newString += 'a';
			} else if (c == 'Z') {
				newString += 'A';
			} else if (c == '9') {
				newString += '1';
			} else {
				newString += ++c;
			}
		}
		System.out.println(newString);
	}
}
