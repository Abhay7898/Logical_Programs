package string_programs;

public class Revers3 {
	public static void main(String[] args) {
		String s = "Abhay Garhwal";
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}
}
