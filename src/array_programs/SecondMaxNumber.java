package array_programs;

public class SecondMaxNumber {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 78, 5, 6, 7, 8, 9, 100,11 };
		int max=0;
		int secondMax=0;
		for (int i : a) {
				if (i>max) {
					secondMax=max;
					max=i;
				}
				else if (max>i&&secondMax<i) {
					secondMax=i;
				}
		}
		System.out.println(secondMax);
	}
}
