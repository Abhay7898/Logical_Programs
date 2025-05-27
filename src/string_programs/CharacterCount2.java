package string_programs;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount2 {
	public static void main(String[] args) {
		// h1e1l3o2w1r1d1
		String s = "hello world";

		Map<Character, Integer> m = new HashMap<Character, Integer>();

		for (char c : s.replaceAll("\\s", "").toLowerCase().toCharArray()) {
			if (m.containsKey(c)) {
				m.put(c, m.get(c) + 1);
			} else {
				m.put(c, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : m.entrySet()) {
			System.out.print("" + entry.getKey() + entry.getValue());
		}
	}
}
