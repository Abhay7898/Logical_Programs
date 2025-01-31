package string_programs;

public class Find_Longest_Substring_Without_Repeating_Characters {
	public static void main(String[] args) {
		String s = "java2novice";
		String sub = "";
		for (int i = 0; i < s.length(); i++) {
			boolean falge = false;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					falge = true;
					sub = "";
					break;
				}
			}
			if (!falge) {
				sub += s.charAt(i);
			}
		}
		System.out.println(sub);
	}
}
