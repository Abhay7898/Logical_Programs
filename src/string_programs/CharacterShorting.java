package string_programs;

import java.util.Arrays;

public class CharacterShorting {
	public static void main(String[] args) {
		char a[] = { 'K', 'L', 'D', 'D', 'E', 'A', 'C', 'G', 'H' };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					char ch = a[i];
					a[i] = a[j];
					a[j] = ch;
				}
			}
		}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
}
