package string_programs;

public class InsertNextCharacterOnlyInCapitalLetter {
	public static void main(String[] args) {
		String s = "Abhay Garhwal";
		String capital = "";
		for (char c : s.toLowerCase().toCharArray()) {
			if (c == ' ') {
				capital += c;
			} else if (c == 'z') {
				capital += 'A';
			} else {
				capital += (char) ((int) ++c - 32);
			}
		}
		System.out.println(capital);
	}
}
