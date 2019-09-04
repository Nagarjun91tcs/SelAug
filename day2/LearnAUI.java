package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnAUI {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//button[text()='✕']").click();
		Actions builder = new Actions(driver);
//		builder.dragAndDrop(source, target)
		
		WebElement electronics = driver.findElementByXPath("//span[text()='Electronics']");
		builder.moveToElement(electronics).perform();
	
	}

}






