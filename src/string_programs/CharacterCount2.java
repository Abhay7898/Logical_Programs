package string_programs;

public class CharacterCount2 {
    public static void main(String[] args) {
        String s = "aasdffaaacc";
        for (int i = 0; i < s.length(); i++) {
            boolean flag = false;
            int count = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (i == s.length() - 1) {
                    flag = true;
                }
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                } else {
                    i = j;
                    i--;
                    break;
                }
            }
            System.out.println(s.charAt(i) + " " + count);
            if (flag) {
                break;
            }
        }
    }
}
