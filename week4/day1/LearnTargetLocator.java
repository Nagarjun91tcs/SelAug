package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTargetLocator {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		TargetLocator target = driver.switchTo();
//		Alert alert = target.alert();
		driver.findElementByXPath("//button[text()='Prompt Box']").click();
		/*String text = driver.switchTo().alert().getText();
		System.out.println(text);
//		driver.switchTo().alert().accept();*/
//		driver.switchTo().alert().dismiss();
		/*driver.switchTo().alert().sendKeys("NIIT");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();*/
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		
		
		

	}

}
