package string_programs;

public class Revers4 {
	public static void main(String[] args) {
		String s = "Abhay Garhwal";
		char ch[] = s.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}

	}
}
