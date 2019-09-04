package week2.day2;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");
//		driver.findElementById("home").click();
		driver.findElementByXPath("//button[text()='Go to Home Page']")
			.click();
		/*Point location = driver.findElementById("position").getLocation();
		System.out.println(location);*/
	
	}


}
