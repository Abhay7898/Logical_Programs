package string_programs;

public class CharacterRemove2 {
	public static void main(String[] args) {
		String s = "Abhay Garhwal";
		char remove='g';
		for (char c : s.toLowerCase().toCharArray()) {
			if (c != remove) {
				System.out.print(c);
			}
		}
	}
}
