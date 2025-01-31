package string_programs;

public class InsertBackCharacter {
	public static void main(String[] args) {
		String s = "AbhBay Garhwal";
		String back = "";
		for (char c : s.toCharArray()) {
			if (c == ' ') {
				back += c;
			} else if (c == 'a') {
				back += 'z';
			} else if (c == 'A') {
				back += 'Z';
			} else {
				back += --c;
			}
		}
		System.out.println(back);
	}
}
