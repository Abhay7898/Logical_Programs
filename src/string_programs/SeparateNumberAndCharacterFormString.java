package string_programs;

public class SeparateNumberAndCharacterFormString {
	public static void main(String[] args) {
		String s="I3 A2M N7O4T A1B8H3AY G1AR9H0W4A6L1";
		String number="";
		String ch="";
		for (char c :s.toCharArray()) {
			if (c>='0'&&c<='9') {
				number+=c+" ";
			}else {
				ch+=c;
			}
		}
		System.out.println(number);
		System.out.println(ch);
	}
}
