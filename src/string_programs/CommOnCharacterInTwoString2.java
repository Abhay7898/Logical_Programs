package string_programs;

public class CommOnCharacterInTwoString2 {
	public static void main(String[] args) {
		String s1 = "AbhAay Garhwal".toLowerCase();
		String s2 = "Abhayxzgw".toLowerCase();
		String dup = "";
		for (int i = 0; i < s1.length(); i++) {
			boolean flage = false;
			for (int j = 0; j < i; j++) {
				if (s1.charAt(i) == s1.charAt(j)) {
					flage = true;
					break;
				}
			}
			if (!flage) {
				dup += s1.charAt(i);
			}
		}

		for (int i = 0; i < dup.length(); i++) {
			boolean flage = false;
			for (int j = 0; j < s2.length(); j++) {
				if (dup.charAt(i) == s2.charAt(j)) {
					System.out.print(dup.charAt(i));
					break;
				}
			}
		}
	}
}
