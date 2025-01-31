package string_programs;

public class CharacterRemove1 {
	public static void main(String[] args) {
		String s = "Abhay Garhwal";
		char ch[] = s.toLowerCase().toCharArray();
		s = "";
		for (char c : ch) {
			if (c != 'a') {
				s += c;
			}
		}
		System.out.println(s);
	}
}
