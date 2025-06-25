package string_programs;

public class CharacterCount3{
	public static void main(String[] args) {
		String s = "aasdffaaaccccch";
		for (int i = 0; i < s.length();) {
			int count = 1;
			int next = i + 1;
			
			while (next < s.length() && s.charAt(i) == s.charAt(next)) {
				count++;
				next++;
			}
			
			System.out.print("" + s.charAt(i) + count);
			i = next;
		}
	}
}
