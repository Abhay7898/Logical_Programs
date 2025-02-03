package Test;

public class StringCheck {
	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = "PBR";
		boolean flage = false;
		if (s1.equals(s2)) {
			flage = true;
		} else {
			for (char c1 : s1.toCharArray()) {
				boolean isChecked = false;
				for (char c2 : s2.toCharArray()) {
					if (c1 == c2) {
						flage = true;
						isChecked = true;
						break;
					}
				}
				if (isChecked) {
					break;
				}
			}
		}
		if (flage) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
