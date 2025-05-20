package string_programs;

public class CommOnCharacterInTwoString {
	public static void main(String[] args) {
		String s1 = "Abhay Garhwal";
		String s2 = "Abhay";
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					System.out.print(s2.charAt(j));
					break;
				}
			}
		}
	}
}
