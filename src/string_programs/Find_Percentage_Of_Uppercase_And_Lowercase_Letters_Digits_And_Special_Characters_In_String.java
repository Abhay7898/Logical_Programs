package string_programs;

public class Find_Percentage_Of_Uppercase_And_Lowercase_Letters_Digits_And_Special_Characters_In_String {
	public static void main(String[] args) {
		String s = "Abhay Garwhal 123!!@#";
		int alpha = 0;
		int number = 0;
		int special = 0;
		int max = s.length();
		for (int i = 0; i < s.length(); i++) {
			int ascii = s.charAt(i);
			if (s.charAt(i) == ' ') {
				max--;
				continue;
			} else if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) {
				alpha++;
			} else if (ascii >= 48 && ascii <= 57) {
				number++;
			} else {
				special++;
			}
		}
		System.out.println(max);
		System.out.println(alpha);
		System.out.println(special);
		System.out.println(number);

		System.out.println("Alpha "+(double)(alpha * 100) / max);
		System.out.println("Num "+(double)(number * 100) / max);
		System.out.println("Special "+(double)(special * 100) / max);

	}
}
