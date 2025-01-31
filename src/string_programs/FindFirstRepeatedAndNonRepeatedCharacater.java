package string_programs;

public class FindFirstRepeatedAndNonRepeatedCharacater {
	public static void main(String[] args) {
		String s = "Abhay Garhwal";
		for (int i = 0; i < s.length(); i++) {
			boolean flage = false;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					System.out.println("the First Repeating Characater is :- " + s.charAt(i));
					flage = true;
					break;
				}
			}
			if (flage) {
				break;
			}
		}
		for (int i = 0; i < s.length(); i++) {
			boolean flage = false;
			for (int j = 0; j < s.length(); j++) {
				if (i != j && s.charAt(i) == s.charAt(j)) {
					flage = true;
					break;
				}
			}
			if (!flage) {
				System.out.print("The first non-repeating character is :- " + s.charAt(i));
				break;
			}
		}
	}
}
