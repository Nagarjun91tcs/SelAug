package week1.day2;

public class Calculator {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 11;
		int choice =1;
		Calculator calc = new Calculator();
		switch(choice) {
		case 1:
			System.out.println(calc.add(num1, num2));
			break;
		case 2:
			System.out.println(num1-num2);
			break;
		default:
			System.out.println(num1*num2);
		}
	}
	
	// add function
	public int add(int num1, int num2) {
		return num1+num2;
	}
	// sub function
	
	
	
	
	
	
	
	
	
	
	

}
