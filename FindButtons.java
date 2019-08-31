package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindButtons {
	public static void main(String[] args) {
		// To set the driver
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		// To launch Chrome
		ChromeDriver driver = new ChromeDriver();
		// To maximize the browser
		driver.manage().window().maximize();
		// To load the URL
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");
		List<WebElement> allButtons = driver.findElementsByTagName("button");
		int size = allButtons.size();
		System.out.println(size);
		WebElement firstButton = allButtons.get(0);
		firstButton.click();
		

	}

}




