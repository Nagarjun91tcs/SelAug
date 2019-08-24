package week1.day1;

public class MyCar {
	public static void main(String[] args) {
		// Call another class
		// ClassName object = new ClassName();
		Car c = new Car();
		// To call variable
		// object.variableName;
		String myBrand = c.brand;
		System.out.println(myBrand);
		// To call method
		// object.methodName();
		boolean punctured = c.isPunctured();
		System.out.println(punctured);
	}

}


