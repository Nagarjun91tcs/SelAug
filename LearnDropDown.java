package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
	//finding the dropdown element
	WebElement eleDropDown2 = driver.findElementByName("dropdown2");
	//Passing the element in Select class for choosing the value
	Select sc = new Select(eleDropDown2);
	sc.selectByIndex(1);
	//for getting all options in the dropdown and the size of it
	List<WebElement> eleOptions = sc.getOptions();	
	System.out.println(eleOptions.size());
	//for printing the values from the list of dropdown elements
	for (WebElement eachOption : eleOptions) {
		System.out.println(eachOption.getText());
	}
	
//	sc.selectByVisibleText("Appium");
//	sc.selectByValue("4");	

	
	
	
	
}
}
