package integer_programs;

public class SwpingTwoVeriableWithOutUsingThriedVariavle {
	public static void main(String[] args) {
		int x = -710;
		int y = -10;
		y = y + x;
		x = y - x;
		y = y - x;

		System.out.println("i = " + x);
		System.out.println( "y = " + y);
	}
}
