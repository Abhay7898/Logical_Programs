package string_programs;

public class StringToNumber {
	public static void main(String[] args) {
		String s = "1234";
		int num = 0;
		for (char c : s.toCharArray()) {
			num = num * 10 + (int) c - 48;
		}
		System.out.println(num);
		int i =Integer.valueOf(s);
		System.out.println(i);
	}
}
