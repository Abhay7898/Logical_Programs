package Interview_question;

import java.util.Comparator;
import java.util.TreeSet;

public class InsertStringAndStringBufferInTreeSet implements Comparator{
	/* Write a Program to insert String and String Buffer Object into the TreeSet
	 * where sorting order is increasing length order if two Objects having the same
	 * length then consider their alphabetical order. Example
	 */
	/*
	 * String Object - A, XX, ZZZ, String Buffer - ABC , AA, ABCD, Final Answer – A,
	 * AA,XX,ABC ZZZ,ABCD
	 */

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new InsertStringAndStringBufferInTreeSet());
		t.add("A");
		t.add("XX");
		t.add("ZZ");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add(new StringBuffer("ABCD"));
		System.out.println(t);
	}

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		if (s1.length() < s2.length()) {
			return -1;
		} else if (s1.length() > s2.length()) {
			return 1;
		}
		return s1.compareTo(s2);
	}
}
