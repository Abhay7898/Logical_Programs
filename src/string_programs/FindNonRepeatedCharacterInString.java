package string_programs;

public class FindNonRepeatedCharacterInString {
	public static void main(String[] args) {
		String s = "ttrgggrrrrxrrarvfggggdddddwwww";

		for (int i = 0; i < s.length(); i++) {
			boolean falge = false;
			for (int j = 0; j < s.length(); j++) {
				if (i != j && s.charAt(i) == s.charAt(j)) {
					falge = true;
					break;
				}
			}
			if (!falge) {
				System.out.print(s.charAt(i)+" ");
			}
		}
	}
}
