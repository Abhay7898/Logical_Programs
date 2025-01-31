package string_programs;

public class AnagramPrograms {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "aab";
		if (s1.length() != s2.length()) {
			System.out.println("Not a Anagram");
		} else {
			int count1 = 0;
			int count2 = 0;
			for (int i = 0; i < s1.length(); i++) {
				count1 += (int) s1.charAt(i);
				count2 += (int) s2.charAt(i);
			}
			if (count1 == count2) {
				System.out.println("Yes");
			} else {
				System.out.println("Not a Anagram");
			}
		}
	}
}
