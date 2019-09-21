package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement eleFrame = driver.findElementByClassName("demo-frame");
		//id="frameReference"
//		driver.switchTo().frame("frameReference");
		driver.switchTo().frame("frameReference");
		driver.findElementByXPath("//li[text()='Item 3']").click();
		driver.switchTo().defaultContent();
		driver.findElementByLinkText("Download").click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
