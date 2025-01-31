package string_programs;

public class Revers2 {
	public static void main(String[] args) {
		String s = "hello a world java javatpoint";
		System.out.println(new StringBuffer(s).reverse());
		System.out.println(new StringBuffer(s).reverse().toString());
	}
}
