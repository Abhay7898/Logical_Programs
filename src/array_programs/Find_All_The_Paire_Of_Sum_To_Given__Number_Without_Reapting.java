package array_programs;

public class Find_All_The_Paire_Of_Sum_To_Given__Number_Without_Reapting {
	public static void main(String[] args) {
		int a[] = { 4, 6, 5, -10, 8, 5, 20 };
		for (int i = 0; i < a.length; i++) {
			for (int j =i+1; j < a.length; j++) {
				if (a[i] + a[j] == 10) {
					System.out.println(a[i] + "+" + a[j] + "=" + "10");
				}
			}

		}
	}
}
