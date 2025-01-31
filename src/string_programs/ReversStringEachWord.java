package string_programs;

public class ReversStringEachWord {
	public static void main(String[] args) {
		String s = "hello a world java javatpoint";
		String revers = "";
		for (String st : s.split("\\s")) {
			String temp = "";
			for (int i = st.length() - 1; i >= 0; i--) {
				temp += st.charAt(i);
			}
			revers += temp + " ";
		}
		System.out.println(revers);
	}
}
