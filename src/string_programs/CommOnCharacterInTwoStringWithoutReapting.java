package string_programs;

public class CommOnCharacterInTwoStringWithoutReapting {
	public static void main(String[] args) {
		String s1 = "Abhay Garhwal";
		String s2 = "Abhay";
		for (int i = 0; i < s1.length(); i++) {
			boolean isduplicate = false;
			for (int j = 0; j < i; j++) {
				if (s1.charAt(i) == s1.charAt(j)) {
					isduplicate = true;
					break;
				}
			}
			if (!isduplicate) {
				for (int j = 0; j < s2.length(); j++) {
					if (s1.charAt(i) == s2.charAt(j)) {
						System.out.print(s1.charAt(i));
						break;
					}
				}
			}
		}
	}
}
