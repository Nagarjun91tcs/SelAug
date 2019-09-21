package week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindows {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByLinkText("Contact Us").click();
		//		String firstWindow = driver.getWindowHandle();
		//		System.out.println(firstWindow);
		System.out.println(driver.getTitle());

		// For window handles
		Set<String> winSet = driver.getWindowHandles();
		List<String> ls = new ArrayList<String>(winSet);
		driver.switchTo().window(ls.get(1));
		System.out.println(driver.getTitle());

		// for snaps
		File src = driver.getScreenshotAs(OutputType.FILE);
		File obj = new File("./snaps/img.png");
		FileUtils.copyFile(src, obj);









	}

}
