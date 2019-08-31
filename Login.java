package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) {
		// To set the driver
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		// To launch Chrome
		ChromeDriver driver = new ChromeDriver();
		// To maximize the browser
		driver.manage().window().maximize();
		// To load the URL
		driver.get("http://leaftaps.com/opentaps");
		// Find the username
		WebElement eleUsername = driver.findElementById("username");
		eleUsername.sendKeys("demosalesmanager"); // enter
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Koushik");
		driver.findElementById("createLeadForm_lastName").sendKeys("C");
		driver.findElementByName("submitButton").click();
		System.out.println(driver.getTitle());
		

	}

}




