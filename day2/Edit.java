package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
//		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
		driver.findElementById("email").sendKeys("babu@testleaf.com");
		// Append a text and press keyboard tab 
		driver.findElement(By.xpath("//input[@value='Append ']"))
		.sendKeys("test", Keys.TAB);
		

	
	}


}


