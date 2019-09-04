package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Link {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/Link.html");
		// Find the second blue link and click

	
	}


}
