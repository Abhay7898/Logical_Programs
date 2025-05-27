package string_programs;

public class MultipleCharacterRemovWithGivenArrays {
	public static void main(String[] args) {
		char ch[] = { 'a', 'b', 'g', 'h' };
		String s = "Abhay Garhwal";
		for (int i = 0; i < ch.length; i++) {
			String temp = "";
			for (int j = 0; j < s.length(); j++) {
				if (ch[i] != s.toLowerCase().charAt(j)) {
					temp += s.charAt(j);
				}
			}
			s = temp;
		}
		System.out.println(s);
	}
}
