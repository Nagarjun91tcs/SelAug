package week1.day2;

public class Fibo {
	// 0, 1, 1, 2, 3, 5, 8
	public static void main(String[] args) {
		int a=0; int b = 1;
		int c = 0;
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i < 20; i++) {
			c = a+b;
			System.out.println(c);
			a =b;
			b = c;
		}
		
	}

}
