package string_programs;

public class StringToUpperCase {
	public static void main(String[] args) {
		String s = "Abhay Garhwal";
		String upper = "";
		for (char c : s.toCharArray()) {
			if (c == ' ') {
				upper += c;
			} else if (c >= 'a' && c <= 'z') {
				upper += (char) (c - 32);
			} else {
				upper += c;
			}
		}
		System.out.println(upper);
	}
}
