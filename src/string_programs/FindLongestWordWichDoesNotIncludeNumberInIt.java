package string_programs;

public class FindLongestWordWichDoesNotIncludeNumberInIt {
	public static void main(String[] args) {
		String s = "Have the function LongestWor2dsen take the sen para5meter being passed and return the";
		String sArray[] = s.split("\\s");
		s = "";
		for (String string : sArray) {
			String word = "";
			for (char c : string.toCharArray()) {
				if (c >= 48 && c <= 57) {
					word = "";
					break;
				} else {
					word += c;
				}
			}
			if (word != "") {
				s += word + " ";
			}
		}
		sArray = s.split("\\s");
		String LongestString = sArray[0];
		for (int j = 1; j < sArray.length; j++) {
			if (LongestString.length() < sArray[j].length()) {
				LongestString = sArray[j];
			}
		}
		System.out.println(LongestString);
	}
}
