package array_programs;

public class SecondMaxNumber {
	public static void main(String[] args) {
		int a[] = { 1000, 2, 3, 78, 5, 6, 7, 8, 9, 100, 11 };
		int max = a[0];
		int secondMax = 0;
		for (int i : a) {
			if (i > max) {
				secondMax = max;
				max = i;
			} else if (max > i && secondMax < i) {
				secondMax = i;
			}
		}
		System.out.println(max);
		System.out.println(secondMax);
		
		
		//int a []= {23400,4500,20000,10000,3000};
	       //int max =a[0];
	       int sec=0;
	       for(int i = 0; i < a.length;i++ ){
	           if(a[i] > max){
	               sec=max;
	               max=a[i];
	           }
	           if(a[i] < max && a[i] > sec){
	               sec=a[i];
	           }
	       }
	       System.out.println(sec);
	    }
	}

