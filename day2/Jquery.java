package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquery {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver
		.manage()
		.timeouts()
		.implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		Actions builder = new Actions(driver);

	}
}




