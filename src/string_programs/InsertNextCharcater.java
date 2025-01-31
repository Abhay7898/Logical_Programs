package string_programs;

public class InsertNextCharcater {
	public static void main(String[] args) {
		String s = "AbhaZy Garhwal";
		String next = "";
		for (char c : s.toCharArray()) {
			if (c == ' ') {
				next += c;
			} else if (c == 'z') {
				next += 'a';
			} else if (c == 'Z') {
				next += 'A';
			} else {
				next += ++c;
			}
		}
		System.out.println(next);
	}
}
