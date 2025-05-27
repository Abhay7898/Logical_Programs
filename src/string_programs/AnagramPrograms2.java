package string_programs;

import java.util.Arrays;

public class AnagramPrograms2 {
	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "sletn";
		
		char ch1[] = s1.replaceAll("\\s", "").toLowerCase().toCharArray();
		char ch2[] = s2.replaceAll("\\s", "").toLowerCase().toCharArray();
		
		boolean flage = false;

		if (ch1.length == ch2.length) {
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			flage = false;
			for (int i = 0; i < ch2.length; i++) {
				if (ch1[i] != ch2[i]) {
					flage = false;
					break;
				}
				flage = true;
			}
		}
		if (flage) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
