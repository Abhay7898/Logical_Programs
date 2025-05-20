package string_programs;

public class CharacterCount1 {
	public static void main(String[] args) {
		// h1e1l3o2w1r1d1
		String s = "hello world";
		String wordCont = "";

		for (int i = 0; i < s.length(); i++) {
			boolean isCounted = false;
			// for space
			if (s.charAt(i) == ' ') {
				continue;
			}

			// for duplicate
			for (int j = 0; j < i; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					isCounted = true;
					break;
				}
			}

			// for count
			if (!isCounted) {
				int count = 0;
				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(i) == s.charAt(j)) {
						count++;
					}
				}
				wordCont += "" + s.charAt(i) + count;
			}

		}
		System.out.println(wordCont);
	}
}
