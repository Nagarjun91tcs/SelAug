package challenges;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LearnWait {
	@Test
	public void alertSnap() throws IOException, AWTException, InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/disapper.html");
		//Thread.sleep(5000);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement ele = driver.findElementByXPath("//button[@id='btn']/b");
		//wait.until(ExpectedConditions.invisibilityOf(ele));
		wait.until(ExpectedConditions.alertIsPresent());
		
		boolean displayed = ele.isDisplayed();
		System.out.println(displayed);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}