package week3.day1;

public class SubClass implements LearnInterface{
	public static void main(String[] args) {
		// Not possible
		// LearnInterface lf = new LearnInterface();

		/*SubClass  sc = new SubClass();
		sc.display();*/
	}
	public void display() {
//		not possible because it's final 
//		- final value cannot be changed
//		num = 10;
		System.out.println("displayed"+num);
	}

	
	
	
	
	
	
	
}
