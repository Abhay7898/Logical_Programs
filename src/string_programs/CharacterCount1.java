package string_programs;

public class CharacterCount1 {
	public static void main(String[] args) {
		// h1e1l3o2w1r1d1
		String s = "hello world".replaceAll("\\s", "");
		
		for (int i = 0; i < s.length(); i++) {
			boolean isCounted = false;
			/*
			 * // for space if (s.charAt(i) == ' ') { continue; }
			 */

			// for check where the char is printed or not 
			for (int j = 0; j < i; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					isCounted = true;
					break;
				}
			}

			// for count
			if (!isCounted) {
				int count = 1;
				for (int j = i+1; j < s.length(); j++) {
					if (s.charAt(i) == s.charAt(j)) {
						count++;
					}
				}
				System.out.print(""+s.charAt(i)+count);
			}
		}
	}
}
