package string_programs;

public class FindLongestWordWichDoesNotIncludeNumberInIt {
	public static void main(String[] args) {
		String s = "Have the function LongestWo3rdsen take the sen parameter being passed and return the";
		String word = "";

		for (String string : s.split("\\s")) {
			boolean flage = false;
			if (word.length() < string.length()) {
				for (char c : string.toCharArray()) {
					if (c >= '0' && c <= '9') {
						flage = true;
						break;
					}
				}
				if (!flage) {
					word = string;
				}
			}
		}
		System.out.println(word);
	}
}
