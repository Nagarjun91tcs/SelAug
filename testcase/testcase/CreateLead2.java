package testcase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead2 extends ProjectSpecificMethods {
	@Test(dataProvider = "fetchData")
	public void runCreateLead(String cName, String fName, String lName) {
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementByName("submitButton").click();

	}

	@DataProvider(name = "fetchData")
	public Object[][] getData() {
		String[][] data = new String[2][4];
		data[0][0] = "TL";
		data[0][1] = "Balaji";
		data[0][2] = "C";
		data[0][3]= "98765";

		data[1][0] = "Wipro";
		data[1][1] = "Sethu";
		data[1][2] = "S";
		data[1][3]= "12345";

		return data;

	}

}
