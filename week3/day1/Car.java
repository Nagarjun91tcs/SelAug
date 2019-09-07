package week3.day1;

public  class Car extends Vechicle{
	final int vehicleNumber = 6982;
	public void applyBrake() {
		System.out.println("ABS Apply brake");
	}

	public void airBag() {
//		vehicleNumber = 12; => final variable can not be changed
		System.out.println("Safety AirBag");
	}
	public void airConditioner() {
		System.out.println("Air Conditioned");
	}

}
