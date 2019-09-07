package week3.day1;

public class Browser {

	public void getTitle() {
		System.out.println("Title of the browser");
	}

	public String getVersion() {
		return "any";
	}

	public String getName() {
		return "any";
	}
	/*
	 * Overloading method
	 */
	public String getName(String platform) {
		if(platform.equals("windows"))
			return "chrome";
		else
			return "any";
	}








}
