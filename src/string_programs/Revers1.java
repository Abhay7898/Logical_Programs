package string_programs;

public class Revers1 {
	public static void main(String[] args) {
		String s = "hello a world java javatpoint";
		String sArray[] = s.split("\\s");
		for (int i = sArray.length - 1; i >= 0; i--) {
			System.out.print(sArray[i] + " ");
		}
	}
}
