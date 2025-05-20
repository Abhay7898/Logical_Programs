package string_programs;

public class AllWhiteSpacesRemove2 {
	public static void main(String[] args) {
		String s = "How do you    	     remove   all white spaces  from a string in Java";
		for (String s1 : s.split("\\s")) {
			if (!s1.isBlank()) {
				System.out.print(s1 + " ");
			}
		}
	}
}
