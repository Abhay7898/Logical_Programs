package string_programs;

import java.util.Arrays;

public class AnagramPrograms {
	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "siletn";
		
		char ch1[] = s1.replaceAll("\\s", "").toLowerCase().toCharArray();
		char ch2[] = s2.replaceAll("\\s", "").toLowerCase().toCharArray();
		
		boolean check = false;
		
		if (ch1.length == ch2.length) {
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if (Arrays.equals(ch1, ch2)) {
				check = true;
			}
		}
		if (check) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
