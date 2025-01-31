package string_programs;

public class Ch {
	public static void main(String[] args) {
		String s = "hello world";
		String wordCont="";
		for (int i = 0; i <s.length(); i++) {
			int count=0;
			boolean isCount=false;
			if (s.charAt(i)==' ') {
				continue;
			}
			for (int j = 0; j <i; j++) {
				if (s.charAt(i)==s.charAt(j)) {
					isCount=true;
					break;
				}
			}
			
			for (int j =0; j <s.length(); j++) {
				if (s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			if (!isCount) {
				wordCont+=""+s.charAt(i)+count;
			}
		}
		System.out.println(wordCont);
	}
}
