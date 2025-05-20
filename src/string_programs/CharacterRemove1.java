package string_programs;

public class CharacterRemove1 {
	public static void main(String[] args) {
		String s = "Abhay Garhwal";
		String s1 = "";
		for (char ch : s.toLowerCase().toCharArray()) {
			if (ch != 'a') {
				s1 += ch;
			}
		}
		System.out.println(s1);
	}
}
