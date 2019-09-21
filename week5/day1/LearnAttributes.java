package week5.day1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LearnAttributes {
@Test
public void login() {
	System.out.println("Login TC");
	
}
//@Test(dependsOnMethods= {"week5.day1.LearnAttributes.login"})
//@AfterMethod(alwaysRun=true)

@Test(enabled=false)
public void createLead() {
	System.out.println("Create Lead TC");
}







}
