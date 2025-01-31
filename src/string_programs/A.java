package string_programs;

public class A {
	public static void main(String[] args) {
		String s1 = "geeks";
		String s2 = "kseeg";

		if (s1.length() != s2.length()) {
			System.out.println("Not an Anagram");
		} else {
			// Create an array to count occurrences of each character
			int[] charCount = new int[26]; // Assuming only lowercase English letters

			// Count characters in the first string
			for (int i = 0; i < s1.length(); i++) {
				charCount[s1.charAt(i) - 'a']++;
			}

			// Subtract counts based on the second string
			for (int i = 0; i < s2.length(); i++) {
				charCount[s2.charAt(i) - 'a']--;
			}

			// Check if all counts are zero
			boolean isAnagram = true;
			for (int count : charCount) {
				if (count != 0) {
					isAnagram = false;
					break;
				}
			}
			if (isAnagram) {
				System.out.println("Yes, they are an Anagram");
			} else {
				System.out.println("Not an Anagram");
			}
		}
	}
}
